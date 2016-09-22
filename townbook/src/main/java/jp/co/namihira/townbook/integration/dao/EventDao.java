/*
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.townbook.integration.dao;

import java.util.List;

import jp.co.namihira.townbook.integration.dto.EventDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EventDao {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public int insert(final EventDto dto){
        final int result = jdbcTemplate.update(
                              "INSERT INTO Events "
                              + "(title, prefectureId, place, content, startDateTime, endDateTime, url) "
                              + "VALUES "
                              + "(:title, :prefectureId, :place, :content, :startDateTime, :endDateTime, :url) ",
                              new BeanPropertySqlParameterSource(dto));
        return result;
    }

    public List<EventDto> selectAll(){
        return jdbcTemplate.query(
                "SELECT * FROM Events ORDER BY id DESC",
                new BeanPropertySqlParameterSource(new EventDto()),
                new BeanPropertyRowMapper<EventDto>(EventDto.class));
    }

    public EventDto selectByPK(final int id){
        final List<EventDto> dtos = jdbcTemplate.query(
                                                    "SELECT * FROM Events WHERE id = :id",
                                                    new MapSqlParameterSource().addValue("id", id),
                                                    new BeanPropertyRowMapper<EventDto>(EventDto.class));
        return dtos.get(0);
    }

    public List<EventDto> selectByPrefId(final String prefectureId){
        return jdbcTemplate.query(
                              "SELECT * FROM Events WHERE prefectureId = :prefectureId",
                              new MapSqlParameterSource().addValue("prefectureId", prefectureId),
                              new BeanPropertyRowMapper<EventDto>(EventDto.class));
    }
    
    public int deleteByPk(final int id) {
        final EventDto dto = new EventDto();
        dto.setId(id);
        return deleteByPk(dto);
    };

    public int deleteByPk(final EventDto dto) {
        return jdbcTemplate.update(
                    "DELETE FROM Events "
                  + "WHERE id = :id",
              new BeanPropertySqlParameterSource(dto));
            };

}
