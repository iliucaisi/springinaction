package com.lucas.springinaction.jms.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: liucaisi
 * @date: 2018/2/23
 */
@Getter
@AllArgsConstructor
public class Spittle implements Serializable{
    private final Long id;
    private final Spitter spitter;
    private final String message;
    private final Date postedTime;
}
