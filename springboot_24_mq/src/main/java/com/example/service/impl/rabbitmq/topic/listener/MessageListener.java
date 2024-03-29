package com.example.service.impl.rabbitmq.topic.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = "topic_queue")
    public void receive(String id){
        System.out.println("完成短信发送(rabbit topic 1)" + id);

    }

    @RabbitListener(queues = "topic_queue2")
    public void receive2(String id){
        System.out.println("完成短信发送(rabbit topic 2)" + id);

    }

}
