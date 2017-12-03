package com.lucas.springinaction.aop.performer;

import com.lucas.springinaction.aop.exception.PerformanceException;

/**
 * @file: TalentCompetition.java
 * @author: caisil
 * @date: 2017/12/3
 */
public interface TalentCompetition {
    void run() throws PerformanceException;
}
