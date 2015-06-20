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
import org.springframework.web.bind.annotation.RequestParam;

/**
 * イベント管理に関するコントローラ
 */
@Controller
public class EventManagementController {

    @Autowired
    private EventDao eventDao;

    @RequestMapping(value = "/events/management", method = GET)
    public String get(Model model) {
        List<EventDto> events = eventDao.selectAll();
        model.addAttribute("events", events);
        return "event/management";
    }

    @RequestMapping(value = "/events/management/delete", method = POST)
    @Transactional(rollbackFor = Throwable.class)
    public String delete(
            @RequestParam(value = "id", required = true) int id,
            Model model) {
        eventDao.deleteByPk(id);
        List<EventDto> events = eventDao.selectAll();
        model.addAttribute("events", events);
        return "event/management";
    }

}
