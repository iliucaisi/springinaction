package com.lucas.springinaction.limeandcoconut;

/**
 * @file: LimeImpl.java
 * @author: caisil
 * @date: 2017/12/2
 */
public class LimeImpl implements Lime{
    public LimeImpl() {
    }

    @Override
    public void drink() {
        System.out.println("Called the doctor woke him up!");
    }
}
