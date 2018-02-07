package com.lucas.springinaction.pizza.domain;

/**
 * @author: liucaisi
 * @date: 2018/2/7
 */
public class CashOrCheckPayment extends Payment{
    @Override
    public String toString() {
       return "CASH or CHECK: $" + getAmount();
    }
}
