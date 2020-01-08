package com.senpure.io.orange.model;


import com.senpure.io.generator.model.Message;

import java.util.ArrayList;
import java.util.List;

/**
 * OrangeMessage
 *
 * @author senpure
 * @time 2019-09-28 11:14:26
 */
public class OrangeMessage extends Message {

    private int port;
    private int command;
    private boolean fileRoot = false;
    private  boolean orangeGenerate=true;
    private List<OrangeMessage> fileChildren = new ArrayList<>();
    private String portName;
    private OrangeMessage response;
    public int getPort() {
        return port;
    }


    public String getJavaHandlerName() {
        return getType() + getName() + "MessagePort";
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getCommand() {
        return command;
    }

    public void setCommand(int command) {
        this.command = command;
    }

    public boolean isFileRoot() {
        return fileRoot;
    }

    public void setFileRoot(boolean fileRoot) {
        this.fileRoot = fileRoot;
    }


    public List<OrangeMessage> getFileChildren() {
        return fileChildren;
    }

    public void setFileChildren(List<OrangeMessage> fileChildren) {
        this.fileChildren = fileChildren;
    }

    public String getPortName() {
        return portName;
    }

    public void setPortName(String portName) {
        this.portName = portName;
    }

    public OrangeMessage getResponse() {
        return response;
    }

    public void setResponse(OrangeMessage response) {
        this.response = response;
    }

    public boolean isOrangeGenerate() {
        return orangeGenerate;
    }

    public void setOrangeGenerate(boolean orangeGenerate) {
        this.orangeGenerate = orangeGenerate;
    }
}
