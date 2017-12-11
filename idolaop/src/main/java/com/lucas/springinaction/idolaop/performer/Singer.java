package com.lucas.springinaction.idolaop.performer;

import com.lucas.springinaction.idolaop.exception.PerformanceException;

/**
 * @file: Singer.java
 * @author: caisil
 * @date: 2017/12/2
 */
public class Singer implements Performer{
    private String name = "Someone";
    private String song;

    public Singer(String name) {
        this(name, null);
    }

    public Singer(String name, String song) {
        this.name = name;
        this.song = song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    @Override
    public void perform() throws PerformanceException {
        if (song == null) {
            throw new PerformanceException(name + " doesn't have a song to " +
                    "sing.");
        }
        System.out.println(name + " is singing " + song);
    }
}
