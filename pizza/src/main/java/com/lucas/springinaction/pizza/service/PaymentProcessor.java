package com.lucas.springinaction.pizza.service;

import com.lucas.springinaction.pizza.exception.PaymentException;

/**
 * @author: liucaisi
 * @date: 2018/2/7
 */
public interface PaymentProcessor {
    void approveCreditCard(String creditCardNumber, String expMonth, String expYear, float amount) throws
            PaymentException;
}
