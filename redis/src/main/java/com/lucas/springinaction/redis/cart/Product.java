package com.lucas.springinaction.redis.cart;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author: liucaisi
 * @date: 2018/2/9
 */
@Getter
@Setter
public class Product implements Serializable{
    private String sku;
    private String name;
    private float price;
}
