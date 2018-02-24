package com.lucas.springinaction.amqp.alerts;


import com.lucas.springinaction.amqp.domain.Spittle;

/**
 * @author: liucaisi
 * @date: 2018/2/23
 */
public interface AlertService {
    void sendSpittleAlert(Spittle spittle);
}
