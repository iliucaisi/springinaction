package com.lucas.springinaction.amqp.message;

import com.lucas.springinaction.amqp.domain.Spittle;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author: liucaisi
 * @date: 2018/2/23
 */
public class ProducerMain {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("amqp-producer.xml");
        AmqpTemplate template = (AmqpTemplate) context.getBean("rabbitTemplate");

        for (int i = 0; i < 20; i++) {
            System.out.println("Sending message #" + i);
            Spittle spittle = new Spittle((long)i, null, "Hello world (" + i + ")", new Date());
            template.convertAndSend(spittle);
            TimeUnit.SECONDS.sleep(5);
        }

        System.out.println("Done!");
    }
}
