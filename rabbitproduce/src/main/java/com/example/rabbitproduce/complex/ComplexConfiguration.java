package com.example.rabbitproduce.complex;

import com.rabbitmq.client.ConnectionFactory;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.JacksonJsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ComplexConfiguration {

    public static final String QUEUE = "complexqueue";
    public static final String EXCHANGE = "complexexchange";
    public static final String ROUTING_KEY = "complexroutekey";

    @Bean
    public Queue queueX() {
        return new Queue(QUEUE);
    }

    @Bean
    public TopicExchange exchangeX() {
        return new TopicExchange(EXCHANGE);
    }

    @Bean
    public Binding bindingX(Queue queueX, TopicExchange exchangeX) {
        return BindingBuilder.bind(queueX).to(exchangeX).with(ROUTING_KEY);
    }

    /*
    @Bean
    public MessageConverter jsonMessageConverter() {
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
        RabbitTemplate template = new RabbitTemplate(connectionFactory);
        template.setMessageConverter(jsonMessageConverter());
        return template;
    }*/

}
