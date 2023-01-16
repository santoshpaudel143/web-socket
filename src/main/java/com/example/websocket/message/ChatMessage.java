package com.example.websocket.message;

/**
 * @Author: Santosh Paudel
 */
public class ChatMessage {
    private String content;
    private String sender;
    private StatusEnum status;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        status = status;
    }

    public enum StatusEnum {
        ACTIVE, INACTIVE, REGISTERED
    }
}
