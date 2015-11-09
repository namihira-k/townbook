/**
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.townbook.web.controller.api;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.util.List;
import java.util.Locale;

import jp.co.namihira.townbook.integration.dao.EventDao;
import jp.co.namihira.townbook.integration.dto.EventDto;
import jp.co.namihira.townbook.web.data.Prefecture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * イベントに関するコントローラ
 */
@RestController
public class EventApiController extends AbstractApiController {

    @Autowired
    private EventDao eventDao;

    @Autowired
    private MessageSource messageSource;

    @RequestMapping(value = "/events", method = GET)
    public List<EventDto> get(Locale locale) {
        final List<EventDto> events = eventDao.selectAll();
        events.forEach(e -> {
            final Prefecture p = Prefecture.parse(e.getPrefectureId());
            e.setPrefectureName(p.getDisplayname(messageSource, locale));
        });
        return events;
    }

    @RequestMapping(value = "/events", method = POST)
    public EventDto post(@RequestBody EventDto event) {
        eventDao.insert(event);
        return event;
    }

    @RequestMapping(value = "/events/{id}", method = DELETE)
    @Transactional(rollbackFor = Throwable.class)
    public void delete(@PathVariable int id) {
        eventDao.deleteByPk(id);
    }

}
