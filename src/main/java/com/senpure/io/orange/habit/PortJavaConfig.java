package com.senpure.io.orange.habit;

import com.senpure.io.generator.executor.LanguageExecutor;
import com.senpure.io.generator.habit.JavaConfig;
import com.senpure.io.orange.executor.PortJavaExecutor;

/**
 * JavaConfig
 *
 * @author senpure
 * @time 2019-07-09 17:00:01
 */
public class PortJavaConfig extends JavaConfig {

    @Override
    public LanguageExecutor languageExecutor() {
        return new PortJavaExecutor();
    }
}
