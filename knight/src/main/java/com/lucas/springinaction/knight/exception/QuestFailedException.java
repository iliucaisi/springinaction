package com.lucas.springinaction.knight.exception;

/**
 * @file: QuestFailedException.java
 * @author: caisil
 * @date: 2017/11/30
 */
public class QuestFailedException extends Exception{
    public QuestFailedException() {}
    public QuestFailedException(String message) {
        super(message);
    }
}
