package com.lucas.springinaction.idol.performer;

import com.lucas.springinaction.idol.exception.PerformanceException;

/**
 * @file: TalentCompetition.java
 * @author: caisil
 * @date: 2017/12/3
 */
public interface TalentCompetition {
    void run() throws PerformanceException;
}
