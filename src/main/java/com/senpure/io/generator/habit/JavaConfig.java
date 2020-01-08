package com.senpure.io.generator.habit;

import com.senpure.io.generator.executor.LanguageExecutor;
import com.senpure.io.orange.executor.PortJavaExecutor;

/**
 * JavaConfig
 *
 * @author senpure
 * @time 2019-07-09 17:00:01
 */
public class JavaConfig extends AbstractLanguageConfig {

    private boolean csMessageHandlerMerge = true;
    private boolean scMessageHandlerMerge = false;

    @Override
    public boolean hasSensitive() {
        if (scMessageHandlerMerge || csMessageHandlerMerge) {
            return true;
        }
        return super.hasSensitive();
    }

    @Override
    public void notAllowSensitive() {
        super.notAllowSensitive();
        csMessageHandlerMerge = false;
        scMessageHandlerMerge = false;
    }

    @Override
    public LanguageExecutor languageExecutor() {
        return new PortJavaExecutor();
    }

    public boolean isCsMessageHandlerMerge() {
        return csMessageHandlerMerge;
    }

    public void setCsMessageHandlerMerge(boolean csMessageHandlerMerge) {
        this.csMessageHandlerMerge = csMessageHandlerMerge;
    }

    public boolean isScMessageHandlerMerge() {
        return scMessageHandlerMerge;
    }

    public void setScMessageHandlerMerge(boolean scMessageHandlerMerge) {
        this.scMessageHandlerMerge = scMessageHandlerMerge;
    }
}
