package com.example.websocket.controller;

import com.example.websocket.message.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

/**
 * @Author: Santosh Paudel
 */
@Controller
@EnableScheduling
public class GreetingController {

    @MessageMapping("/register")
    @SendTo("/topic")
    public ChatMessage register(@Payload ChatMessage chatMessage, SimpMessageHeaderAccessor headerAccessor) {
        headerAccessor.getSessionAttributes().put("userId", chatMessage.getSender());
        return chatMessage;
    }

    @MessageMapping("/send")
    @SendTo("/topic")
    public ChatMessage sendMessage(@Payload ChatMessage chatMessage) {
        System.out.println("==================================== Scheduler Reached ====================================");

        return chatMessage;
    }

//    @Scheduled(fixedDelay = 25000L)
//    public ChatMessage scheduleMessage() {
//        System.out.println("==================================== Scheduler Started ====================================");
//        ChatMessage chatMessage = new ChatMessage();
//        chatMessage.setSender("12312");
//        chatMessage.setSender("jsjss");
//
//        System.out.println("==================================== Scheduler Ended ====================================");
//
//
//        return sendMessage(chatMessage);
//    }

}
