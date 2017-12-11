package com.lucas.springinaction.idolaop.judge;

import com.lucas.springinaction.idolaop.audience.CriticismEngine;

/**
 * @file: JudgeAspect.java
 * @author: caisil
 * @date: 2017/12/3
 */
public aspect JudgeAspect {
    private CriticismEngine criticismEngine;

    public JudgeAspect() {
    }

    public void setCriticismEngine(CriticismEngine criticismEngine) {
        this.criticismEngine = criticismEngine;
    }

    pointcut performance() : execution(* perform(..));

    after() returning() : performance() {
        System.out.printf(criticismEngine.getCriticism());
    }
}
