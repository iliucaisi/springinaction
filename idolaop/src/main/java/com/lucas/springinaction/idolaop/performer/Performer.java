package com.lucas.springinaction.idolaop.performer;

import com.lucas.springinaction.idolaop.exception.PerformanceException;

/**
 * @file: Performer.java
 * @author: caisil
 * @date: 2017/12/2
 */
public interface Performer {
    void perform() throws PerformanceException;
}
