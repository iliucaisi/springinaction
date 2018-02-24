package com.lucas.springinaction.caching.vo;

import com.lucas.springinaction.caching.po.Spittle;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * @author: liucaisi
 * @date: 2017/12/4
 */
@Getter
@Setter
public class SpittleForm {
    @NotNull
    @Size(min = 1, max = 140)
    private String message;

    @NotNull
    @Min(-180)
    @Max(180)
    private Double longitude;

    @NotNull
    @Min(-90)
    @Max(90)
    private Double latitude;

    public Spittle toSpittle() {
        return new Spittle(null, null, message, new Date());
    }
}
