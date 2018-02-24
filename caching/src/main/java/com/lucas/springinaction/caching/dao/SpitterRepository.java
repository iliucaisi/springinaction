package com.lucas.springinaction.caching.dao;

import com.lucas.springinaction.caching.po.Spitter;

import java.util.List;

/**
 * @author: liucaisi
 * @date: 2017/12/4
 */
public interface SpitterRepository {
    long count();
    Spitter save(Spitter spitter);
    Spitter findOne(long id);
    Spitter findByUsername(String username);
    List<Spitter> findAll();
}
