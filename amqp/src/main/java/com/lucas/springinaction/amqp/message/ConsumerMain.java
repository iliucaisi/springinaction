package com.lucas.springinaction.amqp.message;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: liucaisi
 * @date: 2018/2/23
 */
public class ConsumerMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("amqp-consumer.xml");
    }
}
