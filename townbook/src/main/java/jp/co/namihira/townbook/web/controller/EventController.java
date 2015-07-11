/**
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.townbook.web.controller;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.util.List;

import jp.co.namihira.townbook.integration.dao.EventDao;
import jp.co.namihira.townbook.integration.dto.EventDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
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
    public String get(Model model) {
        List<EventDto> events = eventDao.selectAll();
        model.addAttribute("events", events);
        return "event.list";
    }

    @RequestMapping(value = "/events", method = POST)
    @Transactional(rollbackFor = Throwable.class)
    public String post(EventDto event, Model model) {
        eventDao.insert(event);
        return "event.list";
    }

}
