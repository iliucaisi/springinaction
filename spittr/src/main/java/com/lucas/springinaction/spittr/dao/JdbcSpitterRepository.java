package com.lucas.springinaction.spittr.dao;

import com.lucas.springinaction.spittr.po.Spitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author: liucaisi
 * @date: 2017/12/4
 */
@Repository
public class JdbcSpitterRepository implements SpitterRepository{
    private JdbcOperations jdbcOperations;

    @Autowired
    public JdbcSpitterRepository(JdbcOperations jdbcOperations) {
        this.jdbcOperations = jdbcOperations;
    }

    @Override
    public Spitter save(Spitter spitter) {
        jdbcOperations.update(
                "insert into spitter (username, password, first_name, last_name, email)" +
                        " values (?, ?, ?, ?, ?)",
                spitter.getUsername(),
                spitter.getPassword(),
                spitter.getFirstName(),
                spitter.getLastName(),
                spitter.getEmail());
        return spitter;
    }

    @Override
    public Spitter findByUsername(String username) {
        return jdbcOperations.queryForObject(
                "select id, username, null, first_name, last_name, email from Spitter where username=?",
                new SpitterRowMapper(),
                username);
    }

    private static class SpitterRowMapper implements RowMapper<Spitter> {
        @Nullable
        @Override
        public Spitter mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Spitter(rs.getLong("id"), rs.getString("username"), null, rs.getString("first_name"), rs
                    .getString("last_name"), rs.getString("email"));

        }
    }
}
