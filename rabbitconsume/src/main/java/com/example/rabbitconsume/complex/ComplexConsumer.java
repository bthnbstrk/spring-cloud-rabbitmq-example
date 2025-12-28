package com.example.rabbitconsume.complex;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ComplexConsumer {
    @RabbitListener(queues = ComplexConfiguration.QUEUE)
    public void receive(ComplexParent parent) {
        System.out.println(parent.getName());
    }
}
