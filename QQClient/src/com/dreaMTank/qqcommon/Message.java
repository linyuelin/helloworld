package com.dreaMTank.qqcommon;

import java.io.Serializable;

/**
 * @author 林
 * @versoin 1.0
 * 表示客户端和服务器端通信时消息对象
 */
public class Message implements Serializable {
    private  static final long serialVersionUID = 1L;
    private String sender;
    private String getter;
    private String content;
    private String sendTime;
    private String mesType;//消息类型，可以在接口中定义已知类型

    public String getMesType() {
        return mesType;
    }

    public void setMesType(String mesType) {
        this.mesType = mesType;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getGetter() {
        return getter;
    }

    public void setGetter(String getter) {
        this.getter = getter;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }
}
