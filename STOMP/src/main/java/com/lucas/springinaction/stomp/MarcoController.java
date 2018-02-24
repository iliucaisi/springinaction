package com.lucas.springinaction.stomp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.TimeUnit;

/**
 * @author: liucaisi
 * @date: 2018/2/24
 */
@Controller
public class MarcoController {
    private static final Logger LOGGER = LoggerFactory.getLogger(MarcoController.class);

    @RequestMapping("/marco")
    public Shout hanleShout(Shout incoming) throws InterruptedException {
        LOGGER.info("Received message: " + incoming.getMessage());

        TimeUnit.SECONDS.sleep(2);

        Shout outgoing = new Shout();
        outgoing.setMessage("Polo!");
        return outgoing;
    }
}
