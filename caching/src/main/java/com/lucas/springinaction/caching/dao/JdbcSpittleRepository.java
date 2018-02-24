package com.lucas.springinaction.caching.dao;

import com.google.common.collect.Maps;
import com.lucas.springinaction.caching.po.Spitter;
import com.lucas.springinaction.caching.po.Spittle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author: liucaisi
 * @date: 2017/12/4
 */
@Repository
public class JdbcSpittleRepository implements SpittleRepository{
    private static final String SELECT_SPITTLE = "SELECT sp.id, s.id as spitterId, s.username, s.password, s" +
            ".fullname, s.email, s.updateByEmail, sp.message, sp.postedTime FROM spittle sp, spitter s WHERE sp" +
            ".spitter = s.id";
    private static final String SELECT_RECENT_SPITTLES = SELECT_SPITTLE + " ORDER by sp.postedTime DESC LIMIT ?";
    private static final String SELECT_SPITTLE_BY_ID = SELECT_SPITTLE + " AND sp.id=?";
    private static final String SELECT_SPITTLE_BY_SPITTER_ID = SELECT_SPITTLE + " AND s.id=? ORDER BY sp.postedTime DESC";
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public JdbcSpittleRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public long count() {
        return jdbcTemplate.queryForObject("SELECT count(id) FROM spittle", Long.class);
    }

    @Override
    public List<Spittle> findRecent() {
        return findRecent(10);
    }

    @Override
    public List<Spittle> findRecent(int count) {
        return jdbcTemplate.query(SELECT_RECENT_SPITTLES, new SpittleRowMapper(), count);
    }

    @Override
    public Spittle findOne(long id) {
        return jdbcTemplate.queryForObject(SELECT_SPITTLE_BY_ID, new SpittleRowMapper(), id);
    }

    @Override
    public List<Spittle> findBySpitterId(long spitterId) {
        return jdbcTemplate.query(SELECT_SPITTLE_BY_SPITTER_ID, new SpittleRowMapper(), spitterId);
    }

    @Override
    public Spittle save(Spittle spittle) {
        long spittleId = insertSpittleAndReturnId(spittle);
        return new Spittle(spittleId, spittle.getSpitter(), spittle.getMessage(), spittle.getPostedTime());
    }

    private long insertSpittleAndReturnId(Spittle spittle) {
        SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate).withTableName("spittle");
        jdbcInsert.setGeneratedKeyName("id");
        Map<String, Object> args = Maps.newHashMap();
        args.put("spitter", spittle.getSpitter().getId());
        args.put("message", spittle.getMessage());
        args.put("postedTime", spittle.getPostedTime());
        return jdbcInsert.executeAndReturnKey(args).longValue();
    }

    @Override
    public void delete(long id) {
        jdbcTemplate.update("DELETE FROM spittle WHERE id=?", id);
    }

    private static class SpittleRowMapper implements RowMapper<Spittle> {

        @Nullable
        @Override
        public Spittle mapRow(ResultSet rs, int rowNum) throws SQLException {
            long id = rs.getLong("id");
            String message = rs.getString("message");
            Date postedTime = rs.getTimestamp("postedTime");
            long spitterId = rs.getLong("spitterId");
            String username = rs.getString("username");
            String password = rs.getString("password");
            String fullName = rs.getString("fullname");
            String email = rs.getString("email");
            boolean updateByEmail = rs.getBoolean("updateByEmail");
            Spitter spitter = new Spitter(spitterId, username, password, fullName, email, updateByEmail);
            return new Spittle(id, spitter, message, postedTime);
        }
    }
}
