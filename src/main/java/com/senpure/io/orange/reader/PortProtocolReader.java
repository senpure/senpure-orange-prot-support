package com.senpure.io.orange.reader;

import com.senpure.base.util.Assert;
import com.senpure.io.generator.Constant;
import com.senpure.io.generator.model.Enum;
import com.senpure.io.generator.model.*;
import com.senpure.io.generator.reader.IoErrorListener;
import com.senpure.io.orange.antlr.PortBaseListener;
import com.senpure.io.orange.antlr.PortLexer;
import com.senpure.io.orange.antlr.PortParser;
import com.senpure.io.orange.model.OrangeMessage;
import com.senpure.io.orange.util.ProtocolUtil;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * PortProtocolReader
 *
 * @author senpure
 * @time 2019-09-02 17:48:42
 */
public class PortProtocolReader extends PortBaseListener {

    private static Logger logger = LoggerFactory.getLogger(PortProtocolReader.class);
    private List<OrangeMessage> messages = new ArrayList<>(128);
    private List<Bean> beans = new ArrayList<>(128);
    private List<Event> events = new ArrayList<>(128);
    private List<Enum> enums = new ArrayList<>(128);
    private Bean bean;
    private String messageName;
    private String explain;
    private int port;
    private int command;
    private OrangeMessage message;
    private OrangeMessage request;
    private OrangeMessage response;
    private Field field;
    private OrangeMessage fileRoot;
    private String namespace = "com.senpure.io";
    private String javaPackage = "ww.protocol";
    private String luaNamespace = "Io";
    private String jsNamespace = "Io";
    protected String filePath;

    private IoErrorListener ioErrorListener;

    protected StringBuilder errorBuilder = new StringBuilder();


    public void read(File file) {
        try {
            this.filePath = file.getPath();

            this.ioErrorListener = new IoErrorListener(filePath);
            read(CharStreams.fromFileName(file.getAbsolutePath(), Charset.forName("utf-8")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    CommonTokenStream tokens;

    protected void read(CharStream input) {
        Lexer lexer = new PortLexer(input);
        tokens = new CommonTokenStream(lexer);

        PortParser parser = new PortParser(tokens);
        //清除consoleErrorListener
        parser.getErrorListeners().clear();
        parser.addErrorListener(ioErrorListener);
        PortParser.ProtocolContext protocolContext = parser.protocol();
        ParseTreeWalker walker = new ParseTreeWalker();
        if (canWalk()) {
            walker.walk(this, protocolContext);
        }

    }

    public boolean isSyntaxError() {
        return ioErrorListener.isSyntaxError();
    }

    public String getSyntaxErrorMessage() {
        return ioErrorListener.getSyntaxErrorMessage();
    }

    protected boolean canWalk() {
        return !isSyntaxError();
    }

    private void setBeanValue() {
        bean.setNamespace(namespace);
        bean.setJavaPackage(javaPackage);
        bean.setFilePath(filePath);

        Lua lua = new Lua(bean);
        bean.setLua(lua);
        bean.getLua().setNamespace(luaNamespace);
        JavaScript js = new JavaScript(bean);

        bean.setJs(js);
        bean.getJs().setNamespace(jsNamespace);

    }

    private void setBeanName(ParserRuleContext ctx) {
        bean.setOriginalName(ctx.getText());

        Token token = ctx.getStart();
        bean.getNameLocation().setLine(token.getLine());
        bean.getNameLocation().setPosition(token.getCharPositionInLine());
    }

    private void correctName(Bean bean, String name) {
        StringBuilder sb = new StringBuilder();
        int length = name.length();
        boolean lxUp = false;
        for (int i = 0; i < length; i++) {
            char c = name.charAt(i);
            if (c == '_') {
                lxUp = true;
            } else {
                if (lxUp) {
                    if (c > 64 && c < 91) {
                        c += 32;
                    } else {
                        lxUp = false;
                    }
                }
            }
            sb.append(c);
        }
        name = sb.toString();
        int index = name.indexOf("_");
        if (index > -1) {
            name = name.substring(index + 1);
        }
        sb.delete(0, sb.length());
        boolean up = true;
        length = name.length();
        for (int i = 0; i < length; i++) {
            char c = name.charAt(i);
            if (c == '_') {
                up = true;
            } else {
                if (up) {
                    if (c > 96 && c < 123) {
                        c -= 32;
                    }
                    up = false;
                }
                sb.append(c);
            }
        }

        bean.setName(sb.toString());
    }

    protected void checkErrorBuilder() {
        if (errorBuilder.length() > 0) {
            errorBuilder.append("\n");
        }
    }

    @Override
    public void enterBean(PortParser.BeanContext ctx) {
        bean = new Bean();
        beans.add(bean);
        setBeanValue();

        setBeanValue();
        if (Constant.JAVA_PACK_BEAN.trim().length() > 0) {
            bean.setJavaPackage(bean.getJavaPackage()
                    + "."
                    + Constant.JAVA_PACK_BEAN);
        }
    }

    @Override
    public void enterEntityComment(PortParser.EntityCommentContext ctx) {
        String c = ctx.getText().substring(2).trim();
        if (c.length() > 0) {
            String ex = explain;
            if (ex == null) {
                ex = "";
            }
            explain = ex + c;
        }
    }

    @Override
    public void enterBeanName(PortParser.BeanNameContext ctx) {
        setBeanName(ctx);
        correctName(bean, ctx.getText());
        bean.setExplain(explain);
    }

    @Override
    public void enterField(PortParser.FieldContext ctx) {
        field = new Field();
        bean.getFields().add(field);
    }

    @Override
    public void enterFieldType(PortParser.FieldTypeContext ctx) {
        field.setFieldType(ctx.getText());
        Token token = ctx.getStart();

        field.getTypeLocation().setLine(token.getLine());
        field.getTypeLocation().setPosition(token.getCharPositionInLine());

        field.setBaseField(ProtocolUtil.isBaseField(field.getFieldType()));
        if (field.isBaseField()) {
            bean.setHasBean(false);
        } else {
            bean.setHasBean(true);
        }
        bean.getSingleField().put(field.getFieldType(), field);
    }

    @Override
    public void enterFieldList(PortParser.FieldListContext ctx) {
        field.setList(true);
    }

    @Override
    public void enterFieldName(PortParser.FieldNameContext ctx) {
        field.setName(ctx.getText());
        Token token = ctx.getStart();
        field.getNameLocation().setLine(token.getLine());
        field.getNameLocation().setPosition(token.getCharPositionInLine());
    }


    @Override
    public void enterFieldComment(PortParser.FieldCommentContext ctx) {
        String c = ctx.getText().substring(2).trim();
        if (c.length() > 0) {
            field.setExplain(c);
        }
    }

    private void fieldCheck() {
        for (int i = 0; i < bean.getFields().size() - 1; i++) {
            Field f = bean.getFields().get(i);
            if (f.getName().equals(field.getName())) {
                checkErrorBuilder();
                errorBuilder.append(filePath).append(":");
                errorBuilder.append(bean.getName()).append("  field name 相同");
                errorBuilder.append(f.getNameLocation()).append(" ").append(f.getName());
                errorBuilder.append(",").append(field.getNameLocation()).append(" ").append(field.getName());
                // Assert.error(bean.getName() + " field name 相同 " + f.getNameLocation().toString() + " " + f.getName() +
                //        "," + field.getNameLocation().toString() + " " + field.getName());
            }
        }
        int fieldLen = field.getName().length();
        if (fieldLen > bean.getFieldMaxLen()) {
            bean.setFieldMaxLen(fieldLen);
        }
        if (field.isBaseField()) {
            // field.setWriteType(ProtocolUtil.getWriteType(field.getFieldType()));
            field.setJavaType(ProtocolUtil.getJavaType(field.getFieldType()));
//            if (field.isList() && !field.getFieldType().equals("String")) {
//                field.setWriteType(ProtocolUtil.WIRETYPE_LENGTH_DELIMITED);
//            }
            // field.setTag(field.getIndex() << 3 | field.getWriteType());
        } else {
            field.setJavaType(field.getFieldType());
            // field.setWriteType(ProtocolUtil.WIRETYPE_LENGTH_DELIMITED);
            // field.setTag(field.getIndex() << 3 | ProtocolUtil.WIRETYPE_LENGTH_DELIMITED);
        }
        logger.debug("{} {} {}", bean.getType(), bean.getName(), field);
    }

    @Override
    public void exitField(PortParser.FieldContext ctx) {

        fieldCheck();
    }


    @Override
    public void enterMessageName(PortParser.MessageNameContext ctx) {
        messageName = ctx.getText();
    }

    @Override
    public void enterPort(PortParser.PortContext ctx) {
        port = Integer.parseInt(ctx.getText());
    }

    @Override
    public void enterCommand(PortParser.CommandContext ctx) {
        command = Integer.parseInt(ctx.getText());
    }

    @Override
    public void enterRequest(PortParser.RequestContext ctx) {
        request(ctx);
    }

    public void request(ParserRuleContext ctx) {
        message = new OrangeMessage();
        request = message;
        messages.add(message);
        bean = message;
        setBeanName(ctx);
        message.setOriginalName(messageName);
        correctName(message, messageName);
        message.setPort(port);
        message.setCommand(command);

        //String idStr = port + "" + command;
        message.setId((port + command) * 100 + 1);
        message.setType(Constant.ENTITY_TYPE_CS_MESSAGE);

        bean.setExplain(explain);
        setBeanValue();
        message.setJavaHandlerPackage(javaPackage);
        if (Constant.JAVA_PACK_MESSAGE.trim().length() > 0) {
            message.setJavaPackage(message.getJavaPackage() + "." + Constant.JAVA_PACK_MESSAGE);
        }
        if (Constant.JAVA_PACK_HANDLER.trim().length() > 0) {
            //message.setJavaHandlerPackage(message.getJavaHandlerPackage() + "." + Constant.JAVA_PACK_HANDLER);
            message.setJavaHandlerPackage("ww.port");
        }
        if (fileRoot == null) {
            message.setFileRoot(true);
            File file = new File(filePath);
            String name = file.getName().replace(".prot", "");

            int index = 0;
            for (int i = name.length() - 1; i >= 0; i--) {
                if (!Character.isDigit(name.charAt(i))) {
                    index = i;
                    break;
                }
            }
            name = name.substring(0, index + 1);

            if (!name.toLowerCase().endsWith("port")) {
                name += "Port";
            }
            //name = "CS" + name;

            fileRoot = message;
            fileRoot.setPortName(name);
            fileRoot.getFileChildren().add(message);
        } else {
            fileRoot.getFileChildren().add(message);
        }
    }

    @Override
    public void enterResponse(PortParser.ResponseContext ctx) {

        if (request == null) {
            request(ctx);
            request.setOrangeGenerate(false);
        }
        response(ctx);

    }


    private void response(ParserRuleContext ctx) {
        OrangeMessage request = message;
        message = new OrangeMessage();
        response = message;
        messages.add(message);
        bean = message;

        setBeanName(ctx);
        message.setOriginalName(messageName);
        correctName(message, messageName);
        message.setPort(port);
        message.setCommand(command);

        // String idStr = port + "" + command;
        message.setId((port + command) * 100 + 2);
        message.setType(Constant.ENTITY_TYPE_SC_MESSAGE);

        bean.setExplain(explain);
        setBeanValue();
        message.setJavaHandlerPackage(javaPackage);
        if (Constant.JAVA_PACK_MESSAGE.trim().length() > 0) {
            message.setJavaPackage(message.getJavaPackage() + "." + Constant.JAVA_PACK_MESSAGE);
        }
        if (Constant.JAVA_PACK_HANDLER.trim().length() > 0) {
            message.setJavaHandlerPackage(message.getJavaHandlerPackage() + "." + Constant.JAVA_PACK_HANDLER);
        }
        if (request != null && request.getId() + 1 == message.getId()) {
            request.setResponse(message);
        }
    }

    @Override
    public void exitMessage(PortParser.MessageContext ctx) {
        if (request != null && response == null) {
            response(ctx);
        }
        request = null;
        response = null;
    }

    @Override
    public void exitEntity(PortParser.EntityContext ctx) {
        explain = null;

    }

    @Override
    public void exitProtocol(PortParser.ProtocolContext ctx) {
        check();
        if (errorBuilder.length() > 0) {
            Assert.error("校验不合法\n" + errorBuilder.toString());
        }

    }

    private void checkName(Bean a, Bean b, String aName, String bName) {
        if (aName.equals(bName) && a.getNamespace().equals(b.getNamespace())) {

            checkErrorBuilder();
            errorBuilder.append(filePath).append(": 相同命名空间name重复 ").append(aName);
            errorBuilder.append(a.getNameLocation()).append(" ").append(b.getNameLocation());
        }
    }

    private void checkId(Bean a, Bean b, String aName, String bName, int aPort, int bPort, int aCommand, int bCommand) {
        if (a.getType().equals(b.getType()) && aPort == bPort && aCommand == bCommand) {
            checkErrorBuilder();
            errorBuilder.append(filePath).append(": 重复 ").append(aPort).append(",").append(aCommand);
            errorBuilder.append(" ");
            errorBuilder.append(a.getNameLocation()).append(aName)
                    .append(" <--> ").append(b.getNameLocation()).append(bName);
        }
    }

    private void check() {

        List<Bean> beanAndEnums = new ArrayList<>();
        beanAndEnums.addAll(beans);

        for (int i = 0; i < beanAndEnums.size() - 1; i++) {
            Bean a = beanAndEnums.get(i);
            for (int j = i + 1; j < beanAndEnums.size(); j++) {
                Bean b = beanAndEnums.get(j);
                checkName(a, b, a.getName(), b.getName());
            }
        }
        for (int i = 0; i < messages.size() - 1; i++) {
            OrangeMessage a = messages.get(i);
            for (int j = i + 1; j < messages.size(); j++) {
                OrangeMessage b = messages.get(j);
                String aName = a.getType() + a.getName();
                String bName = b.getType() + b.getName();
                checkName(a, b, aName, bName);
                checkId(a, b, aName, bName, a.getPort(), b.getPort(), a.getCommand(), b.getCommand());
            }

        }

    }

    public List<OrangeMessage> getMessages() {
        return messages;
    }

    public void setMessages(List<OrangeMessage> messages) {
        this.messages = messages;
    }

    public List<Bean> getBeans() {
        return beans;
    }

    public void setBeans(List<Bean> beans) {
        this.beans = beans;
    }

    public String getFilePath() {
        return filePath;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public List<Enum> getEnums() {
        return enums;
    }

    public void setEnums(List<Enum> enums) {
        this.enums = enums;
    }
}
