package com.example.service.impl.activemq;

import com.example.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;


//@Service
public class MessageServiceActivemqImpl implements MessageService {
    @Autowired
   private JmsMessagingTemplate jmsMessagingTemplate;
    @Override
    public void sendMessage(String id) {
        System.out.println("带发送短信订单已纳入处理队列,id :" + id);
        jmsMessagingTemplate.convertAndSend("order.queue.id",id);
    }

    @Override
    public String doMessage() {
        String id = jmsMessagingTemplate.receiveAndConvert("order.queue.id",String.class);
        System.out.println("完成短信发送" + id);
        return id;
    }
}
