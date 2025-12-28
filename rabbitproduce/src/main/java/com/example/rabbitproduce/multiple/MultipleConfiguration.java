package com.example.rabbitproduce.multiple;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MultipleConfiguration {

    public static final String QUEUE_A = "queueA";
    public static final String QUEUE_B = "queueB";
    public static final String EXCHANGE_1 = "exchange1";
    public static final String EXCHANGE_2 = "exchange2";
    public static final String EXCHANGE_3 = "exchange3";
    public static final String ROUTING_KEY_A_1 = "routeA1";
    public static final String ROUTING_KEY_A_2 = "routeA2";
    public static final String ROUTING_KEY_A_3 = "routeA2";
    public static final String ROUTING_KEY_B_1 = "routeB1";
    public static final String ROUTING_KEY_B_2 = "routeB2";
    public static final String ROUTING_KEY_B_3 = "routeB2";

    @Bean
    public Queue queueA() {
        return new Queue(QUEUE_A);
    }

    @Bean
    public Queue queueB() {
        return new Queue(QUEUE_B);
    }

    @Bean
    public TopicExchange exchange1() {
        return new TopicExchange(EXCHANGE_1);
    }
    @Bean
    public TopicExchange exchange2() {
        return new TopicExchange(EXCHANGE_2);
    }

    @Bean
    public TopicExchange exchange3() {
        return new TopicExchange(EXCHANGE_3);
    }

    @Bean
    public Binding bindingA1(Queue queueA, TopicExchange exchange1) {
        return BindingBuilder.bind(queueA).to(exchange1).with(ROUTING_KEY_A_1);
    }

    @Bean
    public Binding bindingA2(Queue queueA, TopicExchange exchange2) {
        return BindingBuilder.bind(queueA).to(exchange2).with(ROUTING_KEY_A_2);
    }

    @Bean
    public Binding bindingA3(Queue queueA, TopicExchange exchange3) {
        return BindingBuilder.bind(queueA).to(exchange3).with(ROUTING_KEY_A_3);
    }

    @Bean
    public Binding bindingB1(Queue queueB, TopicExchange exchange1) {
        return BindingBuilder.bind(queueB).to(exchange1).with(ROUTING_KEY_B_1);
    }
    @Bean
    public Binding bindingB2(Queue queueB, TopicExchange exchange2) {
        return BindingBuilder.bind(queueB).to(exchange2).with(ROUTING_KEY_B_2);
    }

    @Bean
    public Binding bindingB3(Queue queueB, TopicExchange exchange3) {
        return BindingBuilder.bind(queueB).to(exchange3).with(ROUTING_KEY_B_3);
    }



}
