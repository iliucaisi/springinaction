package com.lucas.springinaction.hello.app;

import com.lucas.springinaction.hello.service.GreetingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @file: HelloApp.java
 * @author: caisil
 * @date: 2017/11/30
 */
public class HelloApp {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloApp
            .class);
    public static void main(String[] args) {
        LOGGER.debug("HelloApp");
        ApplicationContext context = new ClassPathXmlApplicationContext
                ("applicationContext.xml");
        GreetingService greetingService = (GreetingService) context.getBean
                ("greetingService");
        greetingService.sayGreeting();
    }
}
