package com.lucas.springinaction.aop.performer;

import com.lucas.springinaction.aop.exception.PerformanceException;

/**
 * @file: Performer.java
 * @author: caisil
 * @date: 2017/12/2
 */
public interface Performer {
    void perform() throws PerformanceException;
}
