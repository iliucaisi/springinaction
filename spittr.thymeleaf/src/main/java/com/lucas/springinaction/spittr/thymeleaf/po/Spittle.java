package com.lucas.springinaction.spittr.thymeleaf.po;

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
    private final String message;
    private final Date time;
    private Double longitude;
    private Double latitude;

    public Spittle(String message, Date time) {
        this(null, message, time, null, null);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that, "id", "time");
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this, "id", "time");
    }
}
