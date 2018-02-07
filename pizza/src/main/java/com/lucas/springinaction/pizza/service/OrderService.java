package com.lucas.springinaction.pizza.service;

import com.lucas.springinaction.pizza.domain.Order;

/**
 * @author: liucaisi
 * @date: 2018/2/7
 */
public interface OrderService {
    void saveOrder(Order order);
}
