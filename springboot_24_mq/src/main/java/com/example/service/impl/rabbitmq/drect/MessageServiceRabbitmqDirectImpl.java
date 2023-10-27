package com.example.service.impl.rabbitmq.drect;

import com.example.service.MessageService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class MessageServiceRabbitmqDirectImpl implements MessageService {

    @Autowired
    private AmqpTemplate amqpTemplate ;

    @Override
    public void sendMessage(String id) {
        System.out.println("带发送短信订单已纳入处理队列(rabbitmq),id :" + id);
        amqpTemplate.convertAndSend("directExchange","direct",id);
    }

    @Override
    public String doMessage() {
        return null;
    }
}
