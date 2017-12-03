package com.lucas.springinaction.limeandcoconut;

/**
 * @file: Coconut.java
 * @author: caisil
 * @date: 2017/12/2
 */
public class Coconut implements ICoconut{
    private Lime lime;

    public Coconut() {
    }

    public void setLime(Lime lime) {
        this.lime = lime;
    }

    @Override
    public void drinkThemBothUp() {
        System.out.println("You put the lime in the coconut...");
        System.out.println("and drink 'em both up...");
        System.out.println("You put the lime in the coconut...");
        lime.drink();
    }
}
