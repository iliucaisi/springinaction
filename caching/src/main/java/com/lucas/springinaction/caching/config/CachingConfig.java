package com.lucas.springinaction.caching.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.MalformedURLException;

/**
 * @author: liucaisi
 * @date: 2018/2/13
 */
@Configuration
@EnableCaching
public class CachingConfig {
    @Bean
    public CacheManager cacheManager() throws MalformedURLException {
        return new EhCacheCacheManager();
    }
}
