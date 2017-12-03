package com.lucas.springinaction.idol.performer;

import com.lucas.springinaction.idol.exception.PerformanceException;
import com.lucas.springinaction.idol.instrument.Poem;

/**
 * @file: PoeticJuggler.java
 * @author: caisil
 * @date: 2017/12/2
 */
public class PoeticJuggler extends Juggler{
    private Poem poem;

    public PoeticJuggler(Poem poem) {
        super();
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    @Override
    public void perform() throws PerformanceException {
        super.perform();
        System.out.println("While reciting...");
        poem.recite();
    }
}
