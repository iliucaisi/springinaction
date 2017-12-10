package com.lucas.springinaction.idol;

import com.lucas.springinaction.idol.exception.PerformanceException;
import com.lucas.springinaction.idol.performer.Idol;
import com.lucas.springinaction.idol.performer.TalentCompetition;
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
                ("applicationContext.xml");
        TalentCompetition competition = (TalentCompetition) context.getBean("idol");
        competition.run();
    }
}
