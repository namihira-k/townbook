/**
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.townbook.web.controller;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.util.List;
import java.util.Locale;

import jp.co.namihira.townbook.integration.dao.EventDao;
import jp.co.namihira.townbook.integration.dto.EventDto;
import jp.co.namihira.townbook.web.data.Prefecture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
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

    @Autowired
    private MessageSource messageSource;

    @RequestMapping(value = "/events", method = GET)
    public String get(Locale locale, Model model) {
        final List<EventDto> events = eventDao.selectAll();
        events.forEach(e -> {
            final Prefecture p = Prefecture.parse(e.getPrefectureId());
            e.setPrefectureName(p.getDisplayname(messageSource, locale));
        });
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
