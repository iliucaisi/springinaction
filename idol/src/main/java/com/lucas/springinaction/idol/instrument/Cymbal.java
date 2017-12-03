package com.lucas.springinaction.idol.instrument;

/**
 * @file: Cymbal.java
 * @author: caisil
 * @date: 2017/12/2
 */
public class Cymbal implements Instrument {
    public Cymbal() {
    }

    @Override
    public void play() {
        System.out.println("CRASH CRASH CRASH");
    }
}
