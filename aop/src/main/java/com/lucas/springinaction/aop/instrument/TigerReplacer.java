package com.lucas.springinaction.aop.instrument;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * @file: TigerReplacer.java
 * @author: caisil
 * @date: 2017/12/3
 */
public class TigerReplacer implements MethodReplacer{
    @Override
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        return "A ferocious tiger";
    }
}
