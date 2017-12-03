package com.lucas.springinaction.misc.postprocessor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @file: BeanCounter.java
 * @author: caisil
 * @date: 2017/12/3
 */
public class BeanCounter implements BeanFactoryPostProcessor{
    private static final Logger LOGGER = LoggerFactory.getLogger(BeanCounter.class);

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        LOGGER.debug("BEAN COUNT: " + configurableListableBeanFactory
                .getBeanDefinitionCount());
    }
}
