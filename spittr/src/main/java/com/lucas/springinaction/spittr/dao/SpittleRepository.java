package com.lucas.springinaction.spittr.dao;

import com.lucas.springinaction.spittr.po.Spittle;

import java.util.List;

/**
 * @author: liucaisi
 * @date: 2017/12/4
 */
public interface SpittleRepository {
    List<Spittle> findRecentSpittles();
    List<Spittle> findSpittles(long max, int count);
    Spittle findOne(long id);
    void save(Spittle spittle);
}
