package com.lucas.springinaction.jms.alerts;

import com.lucas.springinaction.jms.domain.Spittle;
import org.springframework.jms.core.JmsOperations;

/**
 * @author: liucaisi
 * @date: 2018/2/23
 */
public class AlertServiceImpl implements AlertService{
    private JmsOperations jmsOperations;

    public AlertServiceImpl(JmsOperations jmsOperations) {
        this.jmsOperations = jmsOperations;
    }

    @Override
    public void sendSpittleAlert(Spittle spittle) {
        jmsOperations.convertAndSend(spittle);
    }

    @Override
    public Spittle retrieveSpittleAlert() {
        return (Spittle) jmsOperations.receiveAndConvert();
    }
}
