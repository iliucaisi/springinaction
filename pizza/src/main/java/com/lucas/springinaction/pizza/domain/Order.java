package com.lucas.springinaction.pizza.domain;

import com.google.common.collect.Lists;
import com.lucas.springinaction.pizza.service.PricingEngine;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Configurable;

import java.io.Serializable;
import java.util.List;

/**
 * @author: liucaisi
 * @date: 2018/2/7
 */
@Configurable("order")
@Getter
@Setter
public class Order implements Serializable{
    private Customer customer;
    private List<Pizza> pizzas;
    private Payment payment;
    private PricingEngine pricingEngine;

    public Order() {
        this.pizzas = Lists.newArrayList();
        this.customer = new Customer();
    }

    public void addPizza(Pizza pizza) {
        this.pizzas.add(pizza);
    }

    public float getTotal() {
        return 0.0f;
    }
}
