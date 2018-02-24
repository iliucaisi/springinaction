package com.lucas.springinaction.caching.dao;

import com.google.common.collect.Maps;
import com.lucas.springinaction.caching.po.Spitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author: liucaisi
 * @date: 2017/12/4
 */
@Repository
public class JdbcSpitterRepository implements SpitterRepository{
    private static final String SELECT_SPITTER = "SELECT id, username, password, fullname, email, updateByEmail FROM " +
            "spitter";
    // @Autowired
    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Override
    public long count() {
        return jdbcTemplate.queryForObject("SELECT count(id) FROM spitter", Long.class);
    }

    @Override
    public Spitter save(Spitter spitter) {
        Long id = spitter.getId();
        if (Objects.isNull(id)) {
            long spitterId = insertSpitterAndReturnId(spitter);
            return new Spitter(spitterId, spitter.getUsername(), spitter.getPassword(), spitter.getFullname(),
                    spitter.getEmail(), spitter.isUpdateByEmail());
        } else {
            jdbcTemplate.update(
                    "UPDATE spitter SET username=?, password=?, fullname=?, email=?, updateByEmail=? WHERE id=?",
                    spitter.getUsername(),
                    spitter.getPassword(),
                    spitter.getFullname(),
                    spitter.getEmail(),
                    id);
        }

        return spitter;
    }

    private long insertSpitterAndReturnId(Spitter spitter) {
        SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate).withTableName("spitter");
        jdbcInsert.setGeneratedKeyName("id");
        Map<String, Object> args = Maps.newHashMap();
        args.put("username", spitter.getUsername());
        args.put("password", spitter.getPassword());
        args.put("fullname", spitter.getFullname());
        args.put("email", spitter.getEmail());
        args.put("updateByEmail", spitter.isUpdateByEmail());
        return jdbcInsert.executeAndReturnKey(args).longValue();
    }

    @Override
    public Spitter findOne(long id) {
        return jdbcTemplate.queryForObject(SELECT_SPITTER + " WHERE id=?", new SpitterRowMapper(), id);

    }

    @Override
    public Spitter findByUsername(String username) {
        return jdbcTemplate.queryForObject("SELECT id, username, password, fullname, email, updateByEmail FROM " +
                "spitter WHERE username=?", new SpitterRowMapper(), username);
    }

    @Override
    public List<Spitter> findAll() {
        return jdbcTemplate.query("SELECT id, username, password, fullname, email, updateByEmail FROM spitter order " +
                "BY id", new SpitterRowMapper());
    }

    private static class SpitterRowMapper implements RowMapper<Spitter> {
        @Override
        public Spitter mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Spitter(rs.getLong("id"), rs.getString("username"), rs.getString("password"), rs
                    .getString("fullname"), rs.getString("email"), rs.getBoolean("updateByEmail"));

        }
    }
}
