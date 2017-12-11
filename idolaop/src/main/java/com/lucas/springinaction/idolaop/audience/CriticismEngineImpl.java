package com.lucas.springinaction.idolaop.audience;

/**
 * @file: CriticismEngineImpl.java
 * @author: caisil
 * @date: 2017/12/3
 */
public class CriticismEngineImpl implements CriticismEngine {
    private String[] criticismPool;

    public CriticismEngineImpl() {
    }

    public void setCriticismPool(String[] criticismPool) {
        this.criticismPool = criticismPool;
    }

    @Override
    public String getCriticism() {
        int i = (int) (Math.random() * criticismPool.length);
        return criticismPool[i];
    }
}
