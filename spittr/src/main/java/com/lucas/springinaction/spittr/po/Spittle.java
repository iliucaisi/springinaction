package com.lucas.springinaction.spittr.po;

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
@RequiredArgsConstructor(staticName = "of")
public class Spittle {
    private Long id;
    private final String message;
    private final Date time;
    private Double longitude;
    private Double latitude;

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that, "id", "time");
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this, "id", "time");
    }
}
