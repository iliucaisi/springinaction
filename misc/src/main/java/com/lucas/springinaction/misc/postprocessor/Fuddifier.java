package com.lucas.springinaction.misc.postprocessor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

import java.lang.reflect.Field;

/**
 * @file: Fuddifier.java
 * @author: caisil
 * @date: 2017/12/3
 */
public class Fuddifier implements BeanPostProcessor{
    private static final Logger LOGGER = LoggerFactory.getLogger(Fuddifier.class);
    @Override
    public Object postProcessAfterInitialization(Object bean, String name) {
        LOGGER.debug("[postProcessAfterInitialization]+++++++++++++++++++++++");
        Field[] fields = bean.getClass().getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            if (fields[i].getType().equals(java.lang.String.class)) {
                fields[i].setAccessible(true);
                try {
                    String original = (String) fields[i].get(bean);
                    fields[i].set(bean, fuddify(original));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return bean;
    }

    private String fuddify(String original) {
        if (original == null) {
            return original;
        }
        return original.replaceAll("(r|l)", "w").replaceAll("(R|L)", "W");
    }

    @Nullable
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        LOGGER.debug("[postProcessBeforeInitialization]----------------------");
        return bean;
    }
}
