package com.example.service.impl;

import com.example.service.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SendMailServiceImpl implements SendMailService {

    @Autowired
    private JavaMailSender javaMailSender;

    private String from ="linyuelin1997@gmail.com";
    private String to ="2531923334@qq.com";
    private String subject ="测试邮件";
    private String context ="测试邮件正文";


    @Override
    public void sendMail() {
        SimpleMailMessage message  = new SimpleMailMessage() ;
        message.setFrom(from);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(context);
        javaMailSender.send(message);
    }
}
