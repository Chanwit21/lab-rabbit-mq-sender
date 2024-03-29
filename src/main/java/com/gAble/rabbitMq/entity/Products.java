package com.gAble.rabbitMq.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Products implements Serializable {
    private String id;
    private String name;
    private Integer items;
}
