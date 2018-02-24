package com.lucas.springinaction.jms;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsOperations;

/**
 * @author: liucaisi
 * @date: 2018/2/23
 */
public class JMSMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("messaging.xml");
        JmsOperations jmsOperations = context.getBean(JmsOperations.class);
        for (int i = 0; i < 10; i++) {
            jmsOperations.convertAndSend("spittle.alert.queue", "Hello");
        }

        context.close();
    }
}
