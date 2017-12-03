package com.lucas.springinaction.aop.instrument;

/**
 * @file: MagicBoxImpl.java
 * @author: caisil
 * @date: 2017/12/3
 */
public class MagicBoxImpl implements MagicBox{
    public MagicBoxImpl() {
    }

    @Override
    public String getContents() {
        return "A beautiful assistant";
    }
}
