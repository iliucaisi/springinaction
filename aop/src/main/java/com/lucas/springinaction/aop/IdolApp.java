package com.lucas.springinaction.aop;

import com.lucas.springinaction.aop.exception.PerformanceException;
import com.lucas.springinaction.aop.performer.Instrumentalist;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @file: IdolApp.java
 * @author: caisil
 * @date: 2017/12/2
 */
public class IdolApp {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext context = new ClassPathXmlApplicationContext
                ("applicationContext_configurable.xml");
        // 1.
//        TalentCompetition competition = (TalentCompetition) context.getBean("idol");
//        competition.run();

        // 2.
        // VM option: -javaagent:aop/lib/aspectjweaver.jar
        Instrumentalist instrumentalist = new Instrumentalist();
        instrumentalist.perform();
    }
}
