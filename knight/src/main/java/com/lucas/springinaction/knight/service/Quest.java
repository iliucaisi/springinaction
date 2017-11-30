package com.lucas.springinaction.knight.service;

import com.lucas.springinaction.knight.exception.QuestFailedException;

/**
 * @file: Quest.java
 * @author: caisil
 * @date: 2017/11/30
 */
public interface Quest {
    Object embark() throws QuestFailedException;
}
