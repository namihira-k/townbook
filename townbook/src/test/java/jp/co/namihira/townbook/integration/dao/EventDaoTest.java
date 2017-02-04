/*
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.townbook.integration.dao;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.List;

import jp.co.namihira.townbook.integration.dto.EventDto;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * {@link EventDao}のテストクラス
 */
@ContextConfiguration(locations="classpath:spring-context-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class EventDaoTest {

    @Autowired
    private EventDao eventDao;

    @Ignore
    @Test
    public void test_insert(){
        // setup
        final EventDto dto = new EventDto();
        dto.setTitle("hoge");
        dto.setContent("hoge");
        dto.setPrefectureId("tokyo");
        dto.setPlace("町田");
        dto.setStartDateTime(LocalDateTime.now());
        dto.setEndDateTime(LocalDateTime.now());

        System.out.println(dto.getStartDateTime().toString());

        // action
        final int result = eventDao.insert(dto);

        // check
        assertNotEquals(0, result);
    }


    @Ignore
    @Test
    public void test_selectAll(){
        // setup
        // - nothing

        // action
        final List<EventDto> results = eventDao.selectAll();

        // check
        assertNotEquals(0, results.size());

        // teardown
        // - nothing
    }

}
