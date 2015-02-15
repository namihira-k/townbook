/**
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.townbook.web.controller;

import static org.springframework.web.bind.annotation.RequestMethod.*;
import jp.co.namihira.townbook.integration.dao.EventDao;
import jp.co.namihira.townbook.integration.dto.EventDto;
import jp.co.namihira.townbook.web.data.Event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * イベントに関するコントローラ
 */
@Controller
public class EventController {

    @Autowired
    private EventDao eventDao;

    @RequestMapping(value = "/events", method = GET)
    public String get() {
        return "event";
    }

    @RequestMapping(value = "/events", method = POST)
    public String post(Event event, Model model) {
        final EventDto dto = new EventDto();
        dto.setTitle(event.getTitle());
        eventDao.insert(dto);
        return "event";
    }

}
