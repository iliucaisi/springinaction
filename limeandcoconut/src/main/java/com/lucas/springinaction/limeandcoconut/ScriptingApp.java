package com.lucas.springinaction.limeandcoconut;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @file: ScriptingApp.java
 * @author: caisil
 * @date: 2017/12/2
 */
public class ScriptingApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext
                ("applicationContext.xml");
        ICoconut coconut = (ICoconut) context.getBean("coconut");
        coconut.drinkThemBothUp();
    }
}
