package com.lucas.springinaction.pizza.domain;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

/**
 * @author: liucaisi
 * @date: 2018/2/7
 */
public enum Topping {
    PEPPERONI,
    SAUSAGE,
    HAMBURGER,
    MUSHROOM,
    CANADIAN_BACON,
    PINEAPPLE,
    GREEN_PEPPER,
    JALAPENO,
    TOMATO,
    ONION,
    EXTRA_CHEESE;

    public static List<Topping> asList() {
       return Arrays.asList(Topping.values());
    }

    @Override
    public String toString() {
       return StringUtils.upperCase(StringUtils.replace(name(), "_", " "));
    }
}
