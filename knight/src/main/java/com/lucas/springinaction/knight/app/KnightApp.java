package com.lucas.springinaction.knight.app;

import com.lucas.springinaction.hello.service.GreetingService;
import com.lucas.springinaction.knight.exception.QuestFailedException;
import com.lucas.springinaction.knight.service.Knight;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @file: HelloApp.java
 * @author: caisil
 * @date: 2017/11/30
 */
public class KnightApp {
    private static final Logger LOGGER = LoggerFactory.getLogger(KnightApp
            .class);
    public static void main(String[] args) throws QuestFailedException {
        LOGGER.debug("KnightApp");
        ApplicationContext context = new ClassPathXmlApplicationContext
                ("applicationContext.xml");

        Knight knight = (Knight) context.getBean("knight");
        knight.embarkOnQuest();
    }
}
