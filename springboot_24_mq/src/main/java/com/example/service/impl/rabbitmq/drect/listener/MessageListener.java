package com.example.service.impl.rabbitmq.drect.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

//@Component
public class MessageListener {

    @RabbitListener(queues = "direct_queue")
    public void receive(String id){
        System.out.println("完成短信发送(rabbit)" + id);

    }

}
