package com.example.rabbitproduce.basic;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BasicRunner implements CommandLineRunner {
    private final BasicProducer basicProducer;

    public BasicRunner(BasicProducer basicProducer) {
        this.basicProducer = basicProducer;
    }

    @Override
    public void run(String... args) throws Exception {
        basicProducer.sendMessage("This is a message !");
    }
}
