package com.example.rabbitconsume.multiple;

import com.example.rabbitconsume.basic.BasicConfiguration;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MultipleConsumer {
    @RabbitListener(queues = MultipleConfiguration.QUEUE_B)
    public void receive(String message) {
        System.out.println(message);
    }
}
