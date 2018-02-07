package com.lucas.springinaction.pizza.domain;

import lombok.Setter;

/**
 * @author: liucaisi
 * @date: 2018/2/7
 */
@Setter
public class CreditCardPayment extends Payment{
    private String authorization;

    @Override
    public String toString() {
        return "CREDIT: $" + getAmount() + " ; AUTH: " + authorization;
    }
}
