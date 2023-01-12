package com.example.websocket.message;

/**
 * @Author: Santosh Paudel
 */
public class Greeting {
    private String content;
    private String id;

    public Greeting() {
    }

    public Greeting(String content, String id) {
        this.content = content;
        this.id = id;
    }

    public Greeting(String s) {

    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
