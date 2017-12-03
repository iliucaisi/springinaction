package com.lucas.springinaction.misc.postprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @file: FuddApp.java
 * @author: caisil
 * @date: 2017/12/3
 */
public class FuddApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext
                ("applicationContext.xml");
        Rabbit bugs = (Rabbit) context.getBean("bugs");
        System.out.println(bugs.getDescription());
    }
}
