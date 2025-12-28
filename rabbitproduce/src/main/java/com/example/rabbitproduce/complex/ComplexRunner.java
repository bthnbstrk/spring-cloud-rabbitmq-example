package com.example.rabbitproduce.complex;

import com.example.rabbitproduce.multiple.MultipleConfiguration;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ComplexRunner implements CommandLineRunner {
    private final RabbitTemplate rabbitTemplate;

    public ComplexRunner(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
        ComplexParent complexParent = new ComplexParent(501,"Karmaşık ana baba");
        ComplexChild child = new ComplexChild(600,"Karmaşık cocuk",54.44);
        complexParent.setComplexChild(child);

        rabbitTemplate.convertAndSend(
                MultipleConfiguration.EXCHANGE_1,
                MultipleConfiguration.ROUTING_KEY_B_1,
                complexParent
        );
        System.out.println("COMPLEX MESSAGE SENDING  " + complexParent.getName());
    }
}
