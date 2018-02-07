package com.lucas.springinaction.pizza.service;

import com.google.common.collect.Maps;
import com.lucas.springinaction.pizza.domain.Order;
import com.lucas.springinaction.pizza.domain.Pizza;
import com.lucas.springinaction.pizza.domain.PizzaSize;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

/**
 * @author: liucaisi
 * @date: 2018/2/7
 */
public class PricingEngineImpl implements PricingEngine{
    private static final Logger LOGGER = LogManager.getLogger(PricingEngineImpl.class);
    private static Map<PizzaSize, Float> SIZE_PRICES;
    static {
        SIZE_PRICES = Maps.newHashMap();
        SIZE_PRICES.put(PizzaSize.SMALL, 6.99f);
        SIZE_PRICES.put(PizzaSize.MEDIUM, 7.99f);
        SIZE_PRICES.put(PizzaSize.LARGE, 8.99f);
        SIZE_PRICES.put(PizzaSize.GINORMOUS, 9.99f);
    }
    private static float PRICE_PER_TOPPING = 0.20f;

    @Override
    public float calculateOrderTotal(Order order) {
        LOGGER.debug("Calculating order total");
        float total = 0.0f;

        for (Pizza pizza : order.getPizzas()) {
            float pizzaPrice = SIZE_PRICES.get(pizza.getSize());
            if (pizza.getToppings().size() > 2) {
                pizzaPrice += (pizza.getToppings().size() * PRICE_PER_TOPPING);
            }
            total += pizzaPrice;
        }

        return total;
    }
}
