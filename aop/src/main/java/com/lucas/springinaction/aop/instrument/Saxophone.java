package com.lucas.springinaction.aop.instrument;

/**
 * @file: Saxophone.java
 * @author: caisil
 * @date: 2017/12/2
 */
public class Saxophone implements Instrument{
    public Saxophone() {
    }

    @Override
    public void play() {
        System.out.println("TOOT TOOT TOOT");
    }
}
