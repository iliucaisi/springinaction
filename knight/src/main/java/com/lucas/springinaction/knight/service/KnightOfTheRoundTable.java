package com.lucas.springinaction.knight.service;

import com.lucas.springinaction.knight.exception.QuestFailedException;

/**
 * @file: KnightOfTheRoundTable.java
 * @author: caisil
 * @date: 2017/11/30
 */
public class KnightOfTheRoundTable implements Knight{
    private String name;
    private Quest quest;

    public KnightOfTheRoundTable(String name) {
        this.name = name;
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    @Override
    public Object embarkOnQuest() throws QuestFailedException {
        return quest.embark();
    }

    @Override
    public String getName() {
        return name;
    }
}
