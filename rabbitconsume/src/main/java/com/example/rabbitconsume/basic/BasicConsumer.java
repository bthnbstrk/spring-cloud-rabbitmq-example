package com.example.rabbitconsume.basic;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class BasicConsumer {

    @RabbitListener(queues = BasicConfiguration.QUEUE)
    public void receive(String message) {
        System.out.println(message);
    }
}
