package com.lucas.springinaction.knight.aop;

import com.lucas.springinaction.knight.service.Knight;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: liucaisi
 * @date: 2017/11/30
 */
public class Minstrel {
    private static final Logger LOGGER = LoggerFactory.getLogger(Minstrel.class);

    public Minstrel() {
    }

    public void singBefore(Knight knight) {
        LOGGER.info("Fa la la; Sir " + knight.getName() + " is so brave!");
    }

    public void singAfter(Knight knight) {
        LOGGER.info("Tee-hee-he; Sir " + knight.getName() + " did embark on quest!");
    }
}
