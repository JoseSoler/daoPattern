package com.zanox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by josesoler on 15.02.15.
 */
@Component
public class DatabaseDao implements Persistable {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void save(Document document) {
        //System.out.println("Document saved into the database !!!");
        jdbcTemplate.update("INSERT INTO Documents values (?,?)", document.getId(), document.getText());
    }

    @Override
    public Document load(Integer id) {
        // System.out.println("Document loaded from the database !!!");
        String sql = "SELECT * FROM Documents WHERE id = ?";

        Document document = (Document) jdbcTemplate.queryForObject(
                sql, new Object[]{id}, new BeanPropertyRowMapper(Document.class));

        return document;
    }
}
