package com.lucas.springinaction.idol.performer;

import com.lucas.springinaction.idol.instrument.Instrument;
import com.lucas.springinaction.idol.performer.Performer;

/**
 * @file: Instrumentalist.java
 * @author: caisil
 * @date: 2017/12/2
 */
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
    public void perform() {
        System.out.println("Playing " + song + " : ");
        instrument.play();
    }
}
