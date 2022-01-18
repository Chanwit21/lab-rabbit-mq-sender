package com.gAble.rabbitMq.controller;

import com.gAble.rabbitMq.entity.Products;
import com.gAble.rabbitMq.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("")
    public ResponseEntity<?> postCustomer(@RequestBody Products body) {
        productService.createProduct(body);
        return ResponseEntity.status(HttpStatus.CREATED).body(body);
    }
}
