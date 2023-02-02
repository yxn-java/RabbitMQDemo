package com.example.rabbitmqdemo;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @RabbitHandler
    @RabbitListener(queuesToDeclare = @Queue("rabbitmq_queue_object"))
    public void process(User user) {
        System.out.println("消费者消费消息111user=====name：" + user.getName()+",password:"+user.getPassword());
    }
}
