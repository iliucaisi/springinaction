package com.lucas.springinaction.caching.dao;

import com.lucas.springinaction.caching.po.Spittle;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * @author: liucaisi
 * @date: 2017/12/4
 */
public interface SpittleRepository {
    long count();
    @Cacheable(value = "spittleCache", cacheManager = "cacheManager")
    List<Spittle> findRecent();
    List<Spittle> findRecent(int count);
    @Cacheable("spittleCache")
    Spittle findOne(long id);
    @CachePut(value = "spittleCache", key = "#result.id")
    Spittle save(Spittle spittle);
    @Cacheable("spittleCache")
    List<Spittle> findBySpitterId(long spitterId);
    @CacheEvict(value = "spittleCache", condition = "")
    void delete(long id);
}
