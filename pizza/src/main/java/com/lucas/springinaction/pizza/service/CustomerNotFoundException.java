package com.lucas.springinaction.pizza.service;

/**
 * @author: liucaisi
 * @date: 2018/2/7
 */
public class CustomerNotFoundException extends Exception{
    public CustomerNotFoundException() {}
    public CustomerNotFoundException(String message) {
        super(message);
    }
}
