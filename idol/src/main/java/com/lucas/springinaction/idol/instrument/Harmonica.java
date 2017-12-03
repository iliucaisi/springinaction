package com.lucas.springinaction.idol.instrument;

/**
 * @file: Harmonica.java
 * @author: caisil
 * @date: 2017/12/2
 */
public class Harmonica implements Instrument{
    public Harmonica() {}
    @Override
    public void play() {
        System.out.println("HUM HUM HUM");
    }
}
