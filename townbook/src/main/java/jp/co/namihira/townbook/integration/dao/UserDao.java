/*
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.townbook.integration.dao;

import java.util.List;
import java.util.UUID;

import jp.co.namihira.townbook.integration.dto.UserDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * User Dao
 */
@Repository
public class UserDao {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public int insert(final UserDto dto){
        dto.setUuid(UUID.randomUUID());
        final int result = jdbcTemplate.update(
                              "INSERT INTO Users "
                              + "(user_id, name, password, uuid)" + " VALUES "
                              + "(:userId, :name, :password, uuid)",
                              new BeanPropertySqlParameterSource(dto));
        return result;
    }

    public List<UserDto> selectAll(){
        return jdbcTemplate.query(
                "SELECT * FROM Users",
                new BeanPropertySqlParameterSource(new UserDto()),
                new BeanPropertyRowMapper<UserDto>(UserDto.class));
    }

    public int deleteByPk(final int id) {
        final UserDto dto = new UserDto();
        dto.setId(id);
        return deleteByPk(dto);
    };

    public int deleteByPk(final UserDto dto) {
        return jdbcTemplate.update(
                    "DELETE FROM Users "
                  + "WHERE id = :id",
              new BeanPropertySqlParameterSource(dto));
            };

}
