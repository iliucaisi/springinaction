package com.lucas.springinaction.aop.performer;

import com.lucas.springinaction.aop.exception.PerformanceException;
import com.lucas.springinaction.aop.instrument.MagicBox;

/**
 * @file: Magician.java
 * @author: caisil
 * @date: 2017/12/3
 */
public class Magician implements Performer{
    private MagicBox magicBox;
    private String magicWords;

    public Magician() {
    }

    public void setMagicBox(MagicBox magicBox) {
        this.magicBox = magicBox;
    }

    public void setMagicWords(String magicWords) {
        this.magicWords = magicWords;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println(magicWords);
        System.out.println("The magic box contains...");
        System.out.println(magicBox.getContents());
    }
}
