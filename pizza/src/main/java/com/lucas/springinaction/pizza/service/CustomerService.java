package com.lucas.springinaction.pizza.service;

import com.lucas.springinaction.pizza.domain.Customer;

/**
 * @author: liucaisi
 * @date: 2018/2/7
 */
public interface CustomerService {
    Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException;
}
