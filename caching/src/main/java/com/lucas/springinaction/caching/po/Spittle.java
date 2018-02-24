package com.lucas.springinaction.caching.po;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.Date;

/**
 * @author: liucaisi
 * @date: 2017/12/4
 */
@Getter
@Setter
@AllArgsConstructor
public class Spittle {
    private Long id;
    private Spitter spitter;
    private final String message;
    private final Date postedTime;
}
