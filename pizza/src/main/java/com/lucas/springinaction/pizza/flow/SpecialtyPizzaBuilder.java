package com.lucas.springinaction.pizza.flow;

import com.google.common.collect.Lists;
import com.lucas.springinaction.pizza.domain.Pizza;
import com.lucas.springinaction.pizza.domain.Topping;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.webflow.execution.Action;
import org.springframework.webflow.execution.Event;
import org.springframework.webflow.execution.RequestContext;

import java.util.List;

/**
 * @author: liucaisi
 * @date: 2018/2/7
 */
public class SpecialtyPizzaBuilder implements Action{
    private static final Logger LOGGER = LogManager.getLogger(SpecialtyPizzaBuilder.class);
    @Override
    public Event execute(RequestContext context) throws Exception {
        String type = context.getRequestParameters().get("pizzaType");
        LOGGER.debug("BUILDING A SPECIALTY PIZZA: " + type);

        Pizza pizza = (Pizza) context.getFlowScope().get("pizza");

        if ("MEAT".equals(type)) {
            LOGGER.debug("BUILDING A CARNIVORE");
            List<Topping> meats = Lists.newArrayList();
            meats.add(Topping.CANADIAN_BACON);
            meats.add(Topping.HAMBURGER);
            meats.add(Topping.PEPPERONI);
            meats.add(Topping.SAUSAGE);

            pizza.setToppings(meats);
        } else if ("VEGGIE".equals(type)) {
            LOGGER.debug("BUILDING A HERBIVORE");
            List<Topping> meats = Lists.newArrayList();
            meats.add(Topping.GREEN_PEPPER);
            meats.add(Topping.MUSHROOM);
            meats.add(Topping.PINEAPPLE);
            meats.add(Topping.TOMATO);

            pizza.setToppings(meats);
        } else if ("THEWORKS".equals(type)) {
            LOGGER.debug("BUILDING AN OMNIVORE");

            List<Topping> meats = Lists.newArrayList();
            System.out.println("THE WORKS!");

            meats.add(Topping.CANADIAN_BACON);
            meats.add(Topping.HAMBURGER);
            meats.add(Topping.PEPPERONI);
            meats.add(Topping.SAUSAGE);
            meats.add(Topping.GREEN_PEPPER);
            meats.add(Topping.MUSHROOM);
            meats.add(Topping.PINEAPPLE);
            meats.add(Topping.TOMATO);
            meats.add(Topping.EXTRA_CHEESE);
            meats.add(Topping.ONION);
            meats.add(Topping.JALAPENO);

            pizza.setToppings(meats);
        }

        context.getFlowScope().put("pizza", pizza);
        return new Event(this, "success");
    }
}
