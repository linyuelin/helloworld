package com.example.service.impl.activemq.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

//@Component
public class MessageListener {

    @JmsListener(destination = "order.queue.id")
    @SendTo("order.other.queue.id")
    public String receive(String id){
        System.out.println("完成短信发送" + id);
        return id;
    }
}
