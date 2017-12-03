package com.lucas.springinaction.idol.performer;

import com.lucas.springinaction.idol.exception.PerformanceException;

import java.util.Iterator;
import java.util.Properties;

/**
 * @file: OneManBand.java
 * @author: caisil
 * @date: 2017/12/2
 */
public class OneManBand implements Performer{
    private Properties instruments;

    public OneManBand() {
    }

    public void setInstruments(Properties instruments) {
        this.instruments = instruments;
    }

    @Override
    public void perform() throws PerformanceException {
        for (Iterator iterator = instruments.keySet().iterator(); iterator
                .hasNext();) {
            String key = (String) iterator.next();
            System.out.println(key + " : " + instruments.getProperty(key));
        }
    }
}
