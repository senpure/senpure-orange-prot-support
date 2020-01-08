package com.senpure.io.orange.reader;


import com.senpure.base.AppEvn;
import com.senpure.io.generator.executor.Executor;
import com.senpure.io.generator.executor.ExecutorContext;
import com.senpure.io.generator.habit.HabitUtil;
import com.senpure.io.generator.habit.ProjectConfig;

import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * Visitor
 *
 * @author senpure
 * @time 2019-09-03 11:30:53
 */
public class Visitor {

    public static void main(String[] args) throws IOException {

        AppEvn.tryMarkClassRootPath();
        AppEvn.installAnsiConsole();
        File file = new File("E:\\XiuZhen\\通信协议\\LandPort5400.prot");
        PortReader.getInstance().read(file,false);
        file = new File("E:\\XiuZhen\\通信协议\\Repeat.prot");
        PortReader.getInstance().read(file,false);
        file = new File("E:\\XiuZhen\\通信协议\\BroadcastPort30000.prot");
       PortReader.getInstance().read(file,false);
        PortReader.getInstance().check();
        ProjectConfig  projectConfig= HabitUtil.getUseConfig();
        ExecutorContext executorContext = new ExecutorContext();
        executorContext.setProjectName(projectConfig.getProjectName());

        for (Map.Entry<String, PortProtocolReader> entry : PortReader.getInstance().getReaderMap().entrySet()) {
            PortProtocolReader reader = entry.getValue();
            executorContext.getBeans().addAll(reader.getBeans());
            executorContext.getMessages().addAll(reader.getMessages());
        }

        executorContext.addLanguageConfig(projectConfig.getJavaConfig());
        //executorContext.addLanguageConfig(projectConfig.getLuaConfig());
       // executorContext.addLanguageConfig(projectConfig.getJsConfig());
        Executor executor = new Executor(executorContext);
        try {
            executor.generate();
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
}
