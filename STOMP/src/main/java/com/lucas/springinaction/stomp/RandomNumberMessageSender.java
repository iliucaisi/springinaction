package com.lucas.springinaction.stomp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author: liucaisi
 * @date: 2018/2/24
 */
@Component
public class RandomNumberMessageSender {
    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @Scheduled(fixedRate = 10000)
    public void sendRandomNumber() {
        Shout random = new Shout();
        random.setMessage("Random # : " + (Math.random() * 100));
        simpMessagingTemplate.convertAndSend("topic/marco", random);
    }
}
