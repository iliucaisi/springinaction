package com.lucas.springinaction.idol.performer;

import com.lucas.springinaction.idol.exception.PerformanceException;

/**
 * @file: Juggler.java
 * @author: caisil
 * @date: 2017/12/2
 */
public class Juggler implements Performer{
    private int beanBags = 3;
    public Juggler() {
    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
    }
}
