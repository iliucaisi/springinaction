package com.lucas.springinaction.pizza.domain;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

/**
 * @author: liucaisi
 * @date: 2018/2/7
 */
public enum PaymentType {
    CASH,
    CHECK,
    CREDIT_CARD;

    public static List<PaymentType> asList() {
        return Arrays.asList(PaymentType.values());
    }

    @Override
    public String toString() {
        return StringUtils.upperCase(StringUtils.replace(name(), "_", " "));
    }
}
