package com.gAble.rabbitMq.config;

import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfig {
    @Bean
    public TopicExchange topic() {
        return new TopicExchange("product.topic");
    }

    @Bean
    public MessageSender sender() {
        return new MessageSender();
    }

}