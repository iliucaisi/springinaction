package com.lucas.springinaction.aop.performer;

import com.lucas.springinaction.aop.exception.PerformanceException;
import com.lucas.springinaction.aop.instrument.Instrument;
import org.springframework.beans.factory.annotation.Configurable;

/**
 * @file: Instrumentalist.java
 * @author: caisil
 * @date: 2017/12/2
 */
@Configurable("pianist")
public class Instrumentalist implements Performer{
    private String song;
    private Instrument instrument;

    public Instrumentalist() {
    }

    public void setSong(String song) {
        this.song = song;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public void perform() throws PerformanceException{
        System.out.println("Playing " + song + " : ");
        instrument.play();
    }
}
