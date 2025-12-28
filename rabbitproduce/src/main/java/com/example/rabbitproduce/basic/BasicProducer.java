package com.example.rabbitproduce.basic;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class BasicProducer {
    private RabbitTemplate rabbitTemplate;

    public BasicProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessage(String message) {
        rabbitTemplate.convertAndSend(BasicConfiguration.EXCHANGE, BasicConfiguration.ROUTING_KEY, message);
        System.out.println("Send operation successfully!\n" + message);
    }
}
