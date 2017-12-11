package com.lucas.springinaction.spittr.dao;

import com.lucas.springinaction.spittr.po.Spitter;

/**
 * @author: liucaisi
 * @date: 2017/12/4
 */
public interface SpitterRepository {
    Spitter save(Spitter spitter);
    Spitter findByUsername(String username);
}
