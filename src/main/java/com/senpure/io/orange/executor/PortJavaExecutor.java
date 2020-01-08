package com.senpure.io.orange.executor;

import com.senpure.base.util.Assert;
import com.senpure.io.generator.executor.AbstractLanguageExecutor;
import com.senpure.io.generator.executor.ExecutorContext;
import com.senpure.io.generator.habit.JavaConfig;
import com.senpure.io.generator.merge.InsertUtil;
import com.senpure.io.generator.merge.java.JavaMergeUtil;
import com.senpure.io.generator.merge.java.antlr.Java8Parser;
import com.senpure.io.generator.merge.java.antlr.Java8ParserBaseListener;
import com.senpure.io.generator.merge.java.model.ClassModel;
import com.senpure.io.generator.model.Bean;
import com.senpure.io.generator.model.Event;
import com.senpure.io.generator.model.Message;
import com.senpure.io.orange.model.OrangeMessage;
import com.senpure.template.FileUtil;
import com.senpure.template.Generator;
import com.senpure.template.sovereignty.Sovereignty;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/**
 * JavaExecutor
 *
 * @author senpure
 * @time 2019-09-25 16:41:16
 */
public class PortJavaExecutor extends AbstractLanguageExecutor<JavaConfig> {
    public static final String TEMPLATE_DIR = "java";
    protected Configuration cfg;
    protected ExecutorContext context;
    protected JavaConfig javaConfig;

    @Override
    public void generate(Configuration cfg, ExecutorContext context, JavaConfig javaConfig) {
        this.cfg = cfg;
        this.context = context;
        this.javaConfig = javaConfig;
        if (javaConfig.isGenerateBean()) {
            generateJavaEnum();
            generateJavaBean();
        }
        if (javaConfig.isGenerateMessage()) {
            generateJavaMessage();
        }
        if (javaConfig.isGenerateCSMessageHandler()) {
            generateJavaCSMessageHandler();
        }
        if (javaConfig.isGenerateSCMessageHandler()) {
            generateJavaSCMessageHandler();
        }
        if (javaConfig.isGenerateEvent()) {
            generateJavaEvent();
        }
        if (javaConfig.isGenerateEventHandler()) {
            generateJavaEventHandler();
        }
    }

    public void generateJavaBean() {
        Template template = null;
        try {
            template = cfg.getTemplate(javaConfig.getBeanTemplate(), "utf-8");
        } catch (IOException e) {
            Assert.error(e);
        }
        for (Bean bean : context.getBeans()) {
            File file = new File(javaConfig.getProtocolCodeRootPath(), FileUtil.fullFileEnd(bean.getJavaPackage().replace(".", File.separator)) + bean.getJavaName() + ".java");
            checkFile(file);
            bean.setSovereignty(Sovereignty.getInstance().sovereigntyJavaComment());
            logger.info("生成 bean {} {}", file.getName(), file.getAbsoluteFile());
            Generator.generate(bean, template, file);
        }

    }

    private void generateJavaEnum() {

        Template template = null;
        try {
            template = cfg.getTemplate(javaConfig.getEnumTemplate(), "utf-8");
        } catch (IOException e) {
            Assert.error(e);
        }
        for (Bean bean : context.getEnums()) {
            File file = new File(javaConfig.getProtocolCodeRootPath(), FileUtil.fullFileEnd(bean.getJavaPackage().replace(".", File.separator)) + bean.getJavaName() + ".java");
            checkFile(file);
            bean.setSovereignty(Sovereignty.getInstance().sovereigntyJavaComment());
            logger.info("生成 enum {} {}", file.getName(), file.getAbsoluteFile());
            Generator.generate(bean, template, file);
        }

    }


    private void generateJavaMessage() {

        Template template = null;
        try {
            template = cfg.getTemplate(javaConfig.getMessageTemplate(), "utf-8");
        } catch (IOException e) {
            Assert.error(e);
        }
        for (Message bean : context.getMessages()) {
            if (bean instanceof OrangeMessage) {
                OrangeMessage orangeMessage = (OrangeMessage) bean;
                if (!orangeMessage.isOrangeGenerate()) {
                    continue;
                }
            }
            File file = new File(javaConfig.getProtocolCodeRootPath(), FileUtil.fullFileEnd(bean.getJavaPackage().replace(".", File.separator)) + bean.getJavaName() + ".java");
            checkFile(file);
            bean.setSovereignty(Sovereignty.getInstance().sovereigntyJavaComment());
            logger.info("生成 message {} {}", file.getName(), file.getAbsoluteFile());
            Generator.generate(bean, template, file);
        }

    }

    private void generateJavaMessageHandler(String type, String templateName, String codeRootPath, boolean fileCover, boolean fileMerge) {

        Template template = null;
        try {
            template = cfg.getTemplate(templateName, "utf-8");
        } catch (IOException e) {
            Assert.error(e);
        }
        for (Message message : context.getMessages()) {

            String handlerName = message.getJavaHandlerName();
            if (message instanceof OrangeMessage) {
                OrangeMessage orangeMessage = (OrangeMessage) message;
                if (!orangeMessage.isFileRoot()) {
                    continue;
                }
                if (type.equals("CS")&&!orangeMessage.isOrangeGenerate()) {
                    continue;
                }
                handlerName = orangeMessage.getPortName();
            }
            message.setSovereignty(Sovereignty.getInstance().sovereigntyJavaComment());
           // if (message.getType().equals(type)) {
                File file = new File(codeRootPath, FileUtil.fullFileEnd(message.getJavaHandlerPackage().replace(".", File.separator)) + handlerName + ".java");
                boolean cover = false;
                if (file.exists()) {
                    if (fileCover) {
                        cover = true;
                    } else if (fileMerge) {
                        logger.info("port 存在尝试合并 {} {}", file.getName(), file.getAbsoluteFile());
                        try {
                            File temp = File.createTempFile("temp", "java");
                            Generator.generate(message, template, temp);
                            //  logger.info(temp.getAbsolutePath());
                            List<ClassModel> rootClassModels = JavaMergeUtil.readClassModel(file.getAbsolutePath());
                            List<ClassModel> dataClassModels = JavaMergeUtil.readClassModel(temp.getAbsolutePath());
                            logger.info("{} 尝试合并方法", file.getName());
                            for (int i = 0; i < rootClassModels.size(); i++) {
                                int data;
                                ClassModel rootClassModel = rootClassModels.get(i);
                                ClassModel dataClassModel = dataClassModels.get(i);
                                data = JavaMergeUtil.mergeMethod(rootClassModel, dataClassModel);
                                if (data > 0) {
                                    rootClassModels = JavaMergeUtil.readClassModel(file.getAbsolutePath());
                                    rootClassModel = rootClassModels.get(i);
                                } else {
                                    logger.info("{} 没有任何方法需要合并.", file.getName());
                                }
                                if (dataClassModel.getNoParametersConstructorDeclarationContext() != null) {
                                    logger.info("{} 尝试合并构造函数方法调用语句", file.getName());
                                    List<Java8Parser.MethodInvocationContext> dataMethodInvocationContexts
                                            = methodInvocationContexts(dataClassModel);
                                    List<Java8Parser.MethodInvocationContext> rootMethodInvocationContexts
                                            = methodInvocationContexts(rootClassModel);
                                    List<Java8Parser.MethodInvocationContext> adds = new ArrayList<>();
                                    for (Java8Parser.MethodInvocationContext dataMethodInvocationContext : dataMethodInvocationContexts) {
                                        String str = dataMethodInvocationContext.getText();

                                        boolean find = false;
                                        for (Java8Parser.MethodInvocationContext rootMethodInvocationContext : rootMethodInvocationContexts) {
                                            if (str.equals(rootMethodInvocationContext.getText())) {
                                                find = true;
                                                break;
                                            }
                                        }
                                        if (!find) {
                                            adds.add(dataMethodInvocationContext);
                                        }
                                    }
                                    int addBytesLength = 0;
                                    if (adds.size() > 0) {
                                        RandomAccessFile rootFile = new RandomAccessFile(rootClassModel.getFilePath(), "rw");
                                        RandomAccessFile dataFile = new RandomAccessFile(dataClassModel.getFilePath(), "r");
                                        JavaMergeUtil.BytePosition bytePosition;
                                        if (rootMethodInvocationContexts.size() > 0) {
                                            bytePosition = JavaMergeUtil.getStartBytePosition(rootFile,
                                                    rootClassModel.getTokens(), rootMethodInvocationContexts.get(0));

                                        } else {
                                            bytePosition = JavaMergeUtil.getBytePosition(rootFile,
                                                    rootClassModel.getNoParametersConstructorDeclarationContext().getStop().getLine(),
                                                    dataClassModel.getNoParametersConstructorDeclarationContext().
                                                            getStop().getCharPositionInLine() - 1
                                            );
                                        }
                                        for (Java8Parser.MethodInvocationContext add : adds) {
                                            //  logger.info(add.getText());
                                            byte[] bytes = JavaMergeUtil.
                                                    readSourceBytes(dataFile, dataClassModel.getTokens(), add,
                                                            1, bytePosition.bytePositionInLine + 1);
                                            bytes[bytes.length - bytePosition.bytePositionInLine - 2] = ';';
                                            bytes[bytes.length - bytePosition.bytePositionInLine - 1] = '\n';
                                            logger.info("\n[{}]", new String(bytes));
                                            InsertUtil.insertBytes(rootFile, bytePosition.position + addBytesLength, bytes);
                                            addBytesLength += bytes.length;
                                        }
                                        rootFile.close();
                                        dataFile.close();
                                    }
                                    if (addBytesLength == 0) {
                                        logger.info("{} 没有任何语句需要合并", file.getName());
                                    }

                                }

                            }
                            temp.delete();

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        continue;
                    }
                    else {
                        logger.warn("port 存在不能生成 {} {}", file.getName(), file.getAbsoluteFile());
                        continue;
                    }
                } else {
                    checkFile(file);
                }
                if (cover) {
                    logger.info("覆盖生成 port {} {}", file.getName(), file.getAbsoluteFile());
                } else {
                    logger.info("生成  port {} {}", file.getName(), file.getAbsoluteFile());
                }
                Generator.generate(message, template, file);

        }
    }

    private List<Java8Parser.MethodInvocationContext> methodInvocationContexts(ClassModel classModel) {
        ParseTreeWalker walker = new ParseTreeWalker();
        List<Java8Parser.MethodInvocationContext> methodInvocationContexts = new ArrayList<>();
        walker.walk(new Java8ParserBaseListener() {

            @Override
            public void enterMethodInvocation(Java8Parser.MethodInvocationContext ctx) {
                methodInvocationContexts.add(ctx);
            }
        }, classModel.
                getNoParametersConstructorDeclarationContext());
        return methodInvocationContexts;
    }

    private void generateJavaCSMessageHandler() {

        generateJavaMessageHandler("CS",
                javaConfig.getCsMessageHandlerTemplate(),
                javaConfig.getCsMessageHandlerCodeRootPath(),
                javaConfig.isCsMessageHandlerOverwrite(),
                javaConfig.isCsMessageHandlerMerge()
        );
    }

    private void generateJavaSCMessageHandler() {

        generateJavaMessageHandler("SC",
                javaConfig.getScMessageHandlerTemplate(),
                javaConfig.getScMessageHandlerCodeRootPath(),
                javaConfig.isScMessageHandlerOverwrite(),
                javaConfig.isScMessageHandlerMerge()
        );
    }

    private void generateJavaEvent() {

        Template template = null;
        try {
            template = cfg.getTemplate(javaConfig.getEventTemplate(), "utf-8");
        } catch (IOException e) {
            Assert.error(e);
        }
        for (Bean bean : context.getEvents()) {
            File file = new File(javaConfig.getProtocolCodeRootPath(), FileUtil.fullFileEnd(bean.getJavaPackage().replace(".", File.separator)) + bean.getJavaName() + ".java");
            checkFile(file);
            bean.setSovereignty(Sovereignty.getInstance().sovereigntyJavaComment());
            logger.info("生成 event {} {}", file.getName(), file.getAbsoluteFile());
            Generator.generate(bean, template, file);
        }

    }

    private void generateJavaEventHandler() {

        Template template = null;
        try {
            template = cfg.getTemplate(javaConfig.getEventHandlerTemplate(), "utf-8");
        } catch (IOException e) {
            Assert.error(e);
        }
        for (Event event : context.getEvents()) {
            File file = new File(javaConfig.getEventHandlerCodeRootPath(), FileUtil.fullFileEnd(event.getJavaHandlerPackage().replace(".", File.separator)) + event.getJavaHandlerName() + ".java");
            boolean cover = false;
            if (file.exists()) {
                if (!javaConfig.isEventHandlerOverwrite()) {
                    logger.warn("eventHandler 存在不能生成 {} {}", file.getName(), file.getAbsoluteFile());
                    continue;
                } else {
                    cover = true;
                }

            } else {
                checkFile(file);
            }
            event.setSovereignty(Sovereignty.getInstance().sovereigntyJavaComment());
            if (cover) {
                logger.info("覆盖生成 eventHandler {} {}", file.getName(), file.getAbsoluteFile());
            } else {
                logger.info("生成 eventHandler {} {}", file.getName(), file.getAbsoluteFile());
            }
            Generator.generate(event, template, file);
        }

    }


    @Override
    public String getTemplateDir() {
        return TEMPLATE_DIR;
    }
}
