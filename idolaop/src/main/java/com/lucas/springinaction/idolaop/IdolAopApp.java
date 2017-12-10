package com.lucas.springinaction.idolaop;

import com.lucas.springinaction.idolaop.exception.PerformanceException;
import com.lucas.springinaction.idolaop.performer.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @file: IdolAopApp.java
 * @author: caisil
 * @date: 2017/12/3
 */
public class IdolAopApp {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext context = new ClassPathXmlApplicationContext
                ("applicationContext.xml");

        Performer performer = (Performer) context.getBean("bo");
        performer.perform();
        System.out.println("------------------------------------");
        Performer performer1 = (Performer) context.getBean("william");
        performer1.perform();
    }
}
