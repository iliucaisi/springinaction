package com.lucas.springinaction.idol.performer;

import com.lucas.springinaction.idol.exception.PerformanceException;

/**
 * @file: Idol.java
 * @author: caisil
 * @date: 2017/12/2
 */
public class Idol implements TalentCompetition {
    private Performer[] performers;
    public Idol() {
    }
    @Override
    public void run() throws PerformanceException {
        for (int i = 0; i < performers.length; i++) {
            Performer performer = performers[i];
            performer.perform();
            System.out.println("----------------------");
        }
    }

    public void setPerformers(Performer[] performers) {
        this.performers = performers;
    }

}
