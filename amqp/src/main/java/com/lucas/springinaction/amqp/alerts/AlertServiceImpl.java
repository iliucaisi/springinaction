package com.lucas.springinaction.amqp.alerts;


import com.lucas.springinaction.amqp.domain.Spittle;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author: liucaisi
 * @date: 2018/2/23
 */
public class AlertServiceImpl implements AlertService{
    private RabbitTemplate rabbitTemplate;

    @Autowired
    public AlertServiceImpl(RabbitTemplate rabbitTemplate) {
       this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void sendSpittleAlert(Spittle spittle) {
        rabbitTemplate.convertAndSend("spittle.alert.exchange", "spittle.alerts", spittle);
    }

}
