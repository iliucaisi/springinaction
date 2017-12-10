package com.lucas.springinaction.idolaop.judge;

import com.lucas.springinaction.idolaop.exception.PerformanceException;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.lang.Nullable;

import java.lang.reflect.Method;

/**
 * @file: MeanJudgeAdvice.java
 * @author: caisil
 * @date: 2017/12/3
 */
public class MeanJudgeAdvice implements MethodBeforeAdvice,
        AfterReturningAdvice, ThrowsAdvice{

    public MeanJudgeAdvice() {
    }

    @Override
    public void afterReturning(@Nullable Object o, Method method, Object[] objects, @Nullable Object o1) throws Throwable {
        System.out.println("AFTER PERFORMANCE");
    }

    @Override
    public void before(Method method, Object[] objects, @Nullable Object o) throws Throwable {
        System.out.println("BEFORE PERFORMANCE");
    }

    public void afterThrowing(PerformanceException exception) {
        System.out.println("AFTER EXCEPTION");
    }
}
