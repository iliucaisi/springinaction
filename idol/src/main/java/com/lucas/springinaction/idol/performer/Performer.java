package com.lucas.springinaction.idol.performer;

import com.lucas.springinaction.idol.exception.PerformanceException;

/**
 * @file: Performer.java
 * @author: caisil
 * @date: 2017/12/2
 */
public interface Performer {
    void perform() throws PerformanceException;
}
