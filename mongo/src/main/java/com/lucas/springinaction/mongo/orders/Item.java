package com.lucas.springinaction.mongo.orders;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: liucaisi
 * @date: 2018/2/9
 */
@Getter
@Setter
public class Item {
    private Long id;
    private Order order;
    private String product;
    private double price;
    private int quantity;
}
