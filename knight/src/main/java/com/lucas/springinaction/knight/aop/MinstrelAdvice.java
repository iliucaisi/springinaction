package com.lucas.springinaction.knight.aop;

import com.lucas.springinaction.knight.service.Knight;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.lang.Nullable;

import java.lang.reflect.Method;

/**
 * @author: liucaisi
 * @date: 2017/11/30
 */
public class MinstrelAdvice implements MethodBeforeAdvice {
//, AfterReturningAdvice, MethodInterceptor {
    @Override
    public void before(Method method, Object[] args, @Nullable Object target) throws Throwable {
        Knight knight = (Knight) target;
        Logger logger = LoggerFactory.getLogger(target.getClass());
        logger.debug("[before] Brave " + knight.getName() + " did " + method.getName());
    }

//    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Method method = invocation.getMethod();
        System.out.println("[invoke] " + method);
        return null;
    }

//    @Override
    public void afterReturning(@Nullable Object returnValue, Method method, Object[] args, @Nullable Object target) throws Throwable {
        Knight knight = (Knight) target;
        Logger logger = LoggerFactory.getLogger(target.getClass());
        logger.debug("[afterReturning] Brave " + knight.getName() + " did " + method.getName());
    }
}
