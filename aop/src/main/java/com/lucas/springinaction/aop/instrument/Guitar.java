package com.lucas.springinaction.aop.instrument;

/**
 * @file: Guitar.java
 * @author: caisil
 * @date: 2017/12/2
 */
public class Guitar implements Instrument{
    public Guitar() {
    }

    @Override
    public void play() {
        System.out.println("STRUM STRUM STRUM");
    }
}
