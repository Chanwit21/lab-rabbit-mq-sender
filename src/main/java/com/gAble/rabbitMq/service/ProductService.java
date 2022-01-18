package com.gAble.rabbitMq.service;

import com.gAble.rabbitMq.config.MessageSender;
import com.gAble.rabbitMq.entity.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    MessageSender sender;

    public void createProduct(Products data){
        sender.sendProduct(data);
    };
}
