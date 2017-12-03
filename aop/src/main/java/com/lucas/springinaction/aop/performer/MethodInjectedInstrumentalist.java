package com.lucas.springinaction.aop.performer;

import com.lucas.springinaction.aop.exception.PerformanceException;
import com.lucas.springinaction.aop.instrument.Instrument;

/**
 * @file: MethodInjectedInstrumentalist.java
 * @author: caisil
 * @date: 2017/12/3
 */
public abstract class MethodInjectedInstrumentalist implements Performer{
    private String song;

    public MethodInjectedInstrumentalist() {
    }

    public void setSong(String song) {
        this.song = song;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println("Playing " + song + " : ");
        getInstrument().play();
    }

    public abstract Instrument getInstrument();
}
