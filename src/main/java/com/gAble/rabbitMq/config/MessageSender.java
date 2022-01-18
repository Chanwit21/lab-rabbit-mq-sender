package com.gAble.rabbitMq.config;


import com.gAble.rabbitMq.entity.Products;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class MessageSender {
    @Autowired
    private TopicExchange topic;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendProduct(Products product) {
        String key = "send.product";
        rabbitTemplate.convertAndSend(topic.getName(), key, product);
    }

}