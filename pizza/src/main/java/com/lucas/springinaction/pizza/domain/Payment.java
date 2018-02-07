package com.lucas.springinaction.pizza.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author: liucaisi
 * @date: 2018/2/7
 */
@Getter
@Setter
public abstract class Payment implements Serializable{
    private float amount;
}
