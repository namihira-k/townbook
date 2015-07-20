/**
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.townbook.web.controller.api;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.util.List;

import jp.co.namihira.townbook.integration.dao.EventDao;
import jp.co.namihira.townbook.integration.dto.EventDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * イベントに関するコントローラ
 */
@RestController
public class EventApiController {

    @Autowired
    private EventDao eventDao;

    @RequestMapping(value = "/api/events", method = GET)
    public List<EventDto> get() {
        return eventDao.selectAll();
    }

}
