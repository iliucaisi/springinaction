package com.lucas.springinaction.pizza.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: liucaisi
 * @date: 2018/2/7
 */
@Getter
@Setter
public class PaymentDetails {
    private PaymentType paymentType;
    private String creditCardNumber;
}
