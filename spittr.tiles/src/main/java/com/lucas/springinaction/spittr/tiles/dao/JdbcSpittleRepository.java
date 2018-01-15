package com.lucas.springinaction.spittr.tiles.dao;

import com.lucas.springinaction.spittr.tiles.po.Spittle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author: liucaisi
 * @date: 2017/12/4
 */
@Repository
public class JdbcSpittleRepository implements SpittleRepository{
    private JdbcOperations jdbcOperations;

    @Autowired
    public JdbcSpittleRepository(JdbcOperations jdbcOperations) {
        this.jdbcOperations = jdbcOperations;
    }

    @Override
    public List<Spittle> findRecentSpittles() {
        return jdbcOperations.query("select id, message, created_at, longitude, latitude from spittle order by " +
                "created_at desc limit 20", new SpittleRowMapper());

    }

    @Override
    public List<Spittle> findSpittles(long max, int count) {
        return jdbcOperations.query("select id, message, created_at, longitude, latitude from spittle where id < ? " +
                "order by created_at limit ?", new SpittleRowMapper(), max,
                count);
    }

    @Override
    public Spittle findOne(long id) {
        return jdbcOperations.queryForObject("select id, message, created_at, longitude, latitude from spittle where id =" +
                " ? ", new SpittleRowMapper(), id);
    }

    @Override
    public void save(Spittle spittle) {
        jdbcOperations.update("insert into spittle (message, created_at, longitude, latitude) values (?, ?, ?, ?)",
                spittle.getMessage(), spittle.getTime(), spittle.getLongitude(), spittle.getLatitude());
    }

    private static class SpittleRowMapper implements RowMapper<Spittle> {

        @Nullable
        @Override
        public Spittle mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Spittle(rs.getLong("id"), rs.getString("message"), rs.getDate("created_at"), rs.getDouble
                    ("longitude"), rs.getDouble("latitude"));
        }
    }
}
