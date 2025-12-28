package com.example.rabbitproduce.multiple;

import com.example.rabbitproduce.basic.BasicProducer;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
public class MultipleRunner implements CommandLineRunner {
    private final RabbitTemplate rabbitTemplate;

    public MultipleRunner(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
        rabbitTemplate.convertAndSend(
                MultipleConfiguration.EXCHANGE_1,
                MultipleConfiguration.ROUTING_KEY_B_1,
                "MAIL TEMPLATE SENDING B1"
        );

        rabbitTemplate.convertAndSend(
                MultipleConfiguration.EXCHANGE_2,
                MultipleConfiguration.ROUTING_KEY_B_2,
                "MAIL TEMPLATE SENDING B2"
        );

        System.out.println("MAIL TEMPLATE SENDING - MULTIPLE WORK");
    }
}
