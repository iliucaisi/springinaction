package com.lucas.springinaction.idolaop.audience;

import com.lucas.springinaction.idolaop.exception.PerformanceException;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @file: AudienceAroundAdvice.java
 * @author: caisil
 * @date: 2017/12/3
 */
public class AudienceAroundAdvice implements MethodInterceptor{
    private Audience audience;

    public void setAudience(Audience audience) {
        this.audience = audience;
    }

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        try {
            audience.takeSeats();
            audience.turnOffCellPhones();

            Object returnValue = methodInvocation.proceed();

            audience.applaud();

            return returnValue;
        } catch (PerformanceException e) {
            audience.demandRefund();
            throw e;
        }
    }
}
