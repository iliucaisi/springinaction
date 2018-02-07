package com.lucas.springinaction.pizza.service;

import com.lucas.springinaction.pizza.domain.Order;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author: liucaisi
 * @date: 2018/2/7
 */
public class OrderServiceImpl implements OrderService{
    private static final Logger LOGGER = LogManager.getLogger(OrderServiceImpl.class);

    @Override
    public void saveOrder(Order order) {
        LOGGER.debug("SAVING ORDER: ");
        LOGGER.debug("   Customer:  " + order.getCustomer().getName());
        LOGGER.debug("   # of Pizzas:  " + order.getPizzas().size());
        LOGGER.debug("   Payment:  " + order.getPayment());
    }
}
