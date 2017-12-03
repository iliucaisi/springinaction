package com.lucas.springinaction.idol.instrument;

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
