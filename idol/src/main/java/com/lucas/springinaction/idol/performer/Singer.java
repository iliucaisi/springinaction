package com.lucas.springinaction.idol.performer;

import com.lucas.springinaction.idol.exception.PerformanceException;
import com.lucas.springinaction.idol.instrument.Song;

/**
 * @file: Singer.java
 * @author: caisil
 * @date: 2017/12/2
 */
public class Singer implements Performer{
    private String name = "Someone";
    private Song song;

    public Singer() {
    }

    public Singer(Song song) {
        this.song = song;
    }

    public Singer(String name, Song song) {
        this.name = name;
        this.song = song;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println(name + " IS SINGING " + song.getTitle());
    }
}
