package com.example.rabbitmqdemo;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Producer {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void produce() {
        User user=new User();
        user.setName("weiz");
        user.setPassword("123456");
        System.out.println("生产者生产消息111=====" + user);
        rabbitTemplate.convertAndSend("rabbitmq_queue_object", user);
    }
}
