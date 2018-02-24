package com.lucas.springinaction.redis.cart;

import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

/**
 * @author: liucaisi
 * @date: 2018/2/9
 */
@Configuration
public class RedisConfig {
    public Jedis redisClient() {
        return new Jedis();
    }
}
