package com.lucas.springinaction.pizza.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author: liucaisi
 * @date: 2018/2/7
 */
@Getter
@Setter
@NoArgsConstructor
public class Customer implements Serializable{
    private Integer id;
    private String name;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;

    public Customer(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
