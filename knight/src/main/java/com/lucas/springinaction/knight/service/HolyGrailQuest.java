package com.lucas.springinaction.knight.service;

import com.lucas.springinaction.knight.exception.QuestFailedException;

/**
 * @author: liucaisi
 * @date: 2017/11/30
 */
public class HolyGrailQuest implements Quest{
    public HolyGrailQuest() {
    }

    @Override
    public Object embark() throws QuestFailedException {
        return new HolyGrail();
    }
}
