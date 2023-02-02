package com.example.rabbitmqdemo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;


@SpringBootTest
public class RabbitMqDemoApplicationTests {
    @Autowired
    Producer producer;
    @Test
    public void contextLoads() throws InterruptedException, IOException {
        producer.produce();
        Thread.sleep(1*1000);
    }
}
