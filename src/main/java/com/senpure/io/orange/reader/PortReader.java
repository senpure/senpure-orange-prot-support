package com.senpure.io.orange.reader;

import com.senpure.base.util.Assert;
import com.senpure.io.generator.model.Bean;
import com.senpure.io.generator.model.Enum;
import com.senpure.io.generator.model.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * PortReader
 *
 * @author senpure
 * @time 2019-09-03 15:08:46
 */
public class PortReader {
    private Logger logger = LoggerFactory.getLogger(getClass());

    private static class Inner {
        private static PortReader portReader = new PortReader();

    }

    public static PortReader getInstance() {
        return Inner.portReader;
    }

    private PortReader() {
    }

    private Map<String, PortProtocolReader> readerMap = new HashMap<>();
    protected StringBuilder errorBuilder = new StringBuilder();

    protected void checkErrorBuilder() {
        if (errorBuilder.length() > 0) {
            errorBuilder.append("\n");
        }
    }

    public void read(List<File> files) {
        for (File file : files) {
            read(file, false);
        }
        check();
    }

    public void read(File[] files) {
        for (File file : files) {
            read(file, false);
        }
        check();
    }

    public PortProtocolReader read(File file) {
        if (file.isDirectory()) {
            read(file.listFiles());
            return null;
        }
        return read(file, true);
    }

    public PortProtocolReader read(File file, boolean check) {
        String key = file.getAbsolutePath();
        if (key.endsWith(".prot")) {
            PortProtocolReader protocolReader = readerMap.get(key);
            if (protocolReader == null) {
                protocolReader = new PortProtocolReader();

                protocolReader.read(file);

                readerMap.putIfAbsent(key, protocolReader);
                if (check) {
                    check();
                }
                return protocolReader;
            }
            return protocolReader;

        } else {
            logger.warn("{} 文件后缀格式不对,需要.prot", key);
        }

        return null;
    }

    public void check() {
        errorBuilder.delete(0, errorBuilder.length());
        for (Map.Entry<String, PortProtocolReader> entry : readerMap.entrySet()) {
            PortProtocolReader protocolReader = entry.getValue();
            if (protocolReader.isSyntaxError()) {
                checkErrorBuilder();
                errorBuilder.append(protocolReader.filePath).append("语法错误\n").append(protocolReader.getSyntaxErrorMessage());
            }
        }
        if (errorBuilder.length() > 0) {
            Assert.error("语法错误\n" + errorBuilder.toString());
        }
        findBenAndAssignment();
        if (errorBuilder.length() > 0) {
            Assert.error("校验不合法\n" + errorBuilder.toString());
        }
    }

    private void findBenAndAssignment() {
        List<Bean> finds = new ArrayList<>();
        // List<Bean> modelBeans = new ArrayList<>();
        List<Bean> allBeans = new ArrayList<>();
        for (Map.Entry<String, PortProtocolReader> entry : readerMap.entrySet()) {
            PortProtocolReader protocolReader = entry.getValue();
            logger.debug("{} bean size {}", protocolReader.filePath, protocolReader.getBeans().size());
            finds.addAll(protocolReader.getBeans());
            finds.addAll(protocolReader.getMessages());
            allBeans.addAll(protocolReader.getBeans());

        }


        findBenAndAssignment(finds, allBeans);
    }

    /**
     * @param beans
     * @param allBeans
     */
    //给bean 下的 bean赋值
    private void findBenAndAssignment(List<Bean> beans, List<Bean> allBeans) {
        for (Bean bean : beans) {
            for (Field field : bean.getFields()) {
                if (!field.isBaseField()) {
                    List<Bean> finds = findBean(field.getFieldType(), allBeans);
                    if (finds.size() == 1) {
                        Bean b = finds.get(0);
                        if (b instanceof Enum) {
                            bean.setHasBean(false);
                        }
                        field.setBean(b);
                        field.setJavaType(b.getJavaName());
                    } else if (finds.size() > 1) {
                        checkErrorBuilder();
                        errorBuilder.append(bean.getFilePath())
                                .append(" ")
                                .append(field.getTypeLocation()).append(" ");
                        errorBuilder.append(bean.getOriginalName()).append(".").append(field.getName());
                        errorBuilder.append("[");
                        errorBuilder.append(field.getFieldType())
                                .append("] Type,引用不明确");
                        for (Bean find : finds) {
                            errorBuilder.append(find.getFilePath()).append(" ").append(find.getNameLocation()).append(" ");
                        }
                    } else {
                        checkErrorBuilder();
                        errorBuilder.append(bean.getFilePath())
                                .append(" ")
                                .append(field.getTypeLocation()).append(" ");
                        errorBuilder.append(bean.getOriginalName()).append(".").append(field.getName());
                        errorBuilder.append("[");
                        errorBuilder.append(field.getFieldType())
                                .append("] Type,未定义，或未引用 ");
                        // Assert.error(filePath + " line " + field.getTypeLocation().getLine() + ":" + field.getTypeLocation().getPosition() + " " + bean.getType() + bean.getName() + "." + field.getName()
                        //      + "[" + field.getFieldType() + "] Type,未定义，或未引用");
                    }

                }
            }
        }
    }

    private static List<Bean> findBean(String type, List<Bean> beans) {
        List<Bean> finds = new ArrayList<>(16);
        for (Bean bean : beans) {
            if (bean.getOriginalName().equals(type)) {
                finds.add(bean);
            }
        }
        return finds;
    }

    public void clear() {
        readerMap.clear();
    }

    public Map<String, PortProtocolReader> getReaderMap() {
        return readerMap;
    }

    public static void main(String[] args) {

    }
}
