package com.sm.bank.fullxml.dao.impl;

import com.sm.bank.fullxml.dao.ActDao;
import com.sm.bank.fullxml.pojo.Act;
import jakarta.annotation.Resource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("actDao")
public class ActDaoImpl implements ActDao {

    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Override
    public Act selectByActno(String actno) {
        String sql = "select actno, balance from t_act where actno = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Act.class), actno);
    }

    @Override
    public int update(Act act) {
        String sql = "update t_act set balance = ? where actno = ?";
        int count = jdbcTemplate.update(sql, act.getBalance(), act.getActno());
        return count;
    }
}
