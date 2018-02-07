package com.lucas.springinaction.pizza.domain;

import com.google.common.collect.Lists;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * @author: liucaisi
 * @date: 2018/2/7
 */
@Getter
@Setter
public class Pizza implements Serializable{
    private PizzaSize size;
    private List<Topping> toppings;

    public Pizza() {
        this.toppings = Lists.newArrayList();
        this.size = PizzaSize.LARGE;
    }
}
