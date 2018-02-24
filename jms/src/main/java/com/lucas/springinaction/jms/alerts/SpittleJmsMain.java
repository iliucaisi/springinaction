package com.lucas.springinaction.jms.alerts;

import com.lucas.springinaction.jms.domain.Spittle;
import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @author: liucaisi
 * @date: 2018/2/23
 */
public class SpittleJmsMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("messaging.xml");
        AlertService alertService = context.getBean(AlertService.class);

        Spittle spittle = new Spittle(1L, null, "Hello", new Date());
        alertService.sendSpittleAlert(spittle);
    }
}
