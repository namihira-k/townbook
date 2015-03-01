/*
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.townbook.integration.dao;

import jp.co.namihira.townbook.integration.dto.EventDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EventDao {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public int insert(final EventDto dto){
        final int result = jdbcTemplate.update(
                              "INSERT INTO Events "
                              + "(title, prefecture, town, content)" + " VALUES "
                              + "(:title, :prefecture, :town, :content) ",
                              new BeanPropertySqlParameterSource(dto));
        return result;
    }

}
