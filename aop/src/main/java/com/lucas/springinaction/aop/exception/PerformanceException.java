package com.lucas.springinaction.aop.exception;

/**
 * @file: PerformanceException.java
 * @author: caisil
 * @date: 2017/12/2
 */
public class PerformanceException extends Exception {
    public PerformanceException() {
       super();
    }

    public PerformanceException(String message) {
        super(message);
    }
}
