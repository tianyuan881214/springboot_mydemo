package com.example.springboot_websocket.demain;

public class WiselyResponse {
    private  String resPonseMessage;

    public WiselyResponse(String resPonseMessage) {
        this.resPonseMessage = resPonseMessage;
    }

    public String getResPonseMessage() {
        return resPonseMessage;
    }
}
