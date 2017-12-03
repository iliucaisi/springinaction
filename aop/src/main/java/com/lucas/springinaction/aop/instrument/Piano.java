package com.lucas.springinaction.aop.instrument;

import org.springframework.beans.factory.annotation.Configurable;

/**
 * @file: Piano.java
 * @author: caisil
 * @date: 2017/12/2
 */
public class Piano implements Instrument{
    public Piano() {
    }

    @Override
    public void play() {
        System.out.println("PLINK PLINK PLINK");
    }
}
