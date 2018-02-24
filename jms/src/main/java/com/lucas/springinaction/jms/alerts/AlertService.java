package com.lucas.springinaction.jms.alerts;

import com.lucas.springinaction.jms.domain.Spittle;

/**
 * @author: liucaisi
 * @date: 2018/2/23
 */
public interface AlertService {
    void sendSpittleAlert(Spittle spittle);
    Spittle retrieveSpittleAlert();
}
