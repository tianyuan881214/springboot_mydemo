package com.example.springboot_websocket.controller;

import com.example.springboot_websocket.demain.WiselyMessage;
import com.example.springboot_websocket.demain.WiselyResponse;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WsController {
    @RequestMapping("/welcome")
    @SendTo("/topic/getResponse")
    public WiselyResponse say(WiselyMessage message) throws Exception {
        Thread.sleep(3000);
        return new WiselyResponse("welcome"+message.getName()+"!");
    }
}
