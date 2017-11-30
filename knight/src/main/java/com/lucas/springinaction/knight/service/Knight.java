package com.lucas.springinaction.knight.service;

import com.lucas.springinaction.knight.exception.QuestFailedException;

/**
 * @file: Knight.java
 * @author: caisil
 * @date: 2017/11/30
 */
public interface Knight {
    Object embarkOnQuest() throws QuestFailedException;
    String getName();
}
