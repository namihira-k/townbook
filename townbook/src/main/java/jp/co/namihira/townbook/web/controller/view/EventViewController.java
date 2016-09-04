/**
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.townbook.web.controller.view;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import jp.co.namihira.townbook.integration.dao.EventDao;
import jp.co.namihira.townbook.integration.dto.EventDto;
import jp.co.namihira.townbook.util.model.ModelConsts;
import jp.co.namihira.townbook.web.controller.view.AbstractViewController;
import jp.co.namihira.townbook.web.data.Prefecture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * イベントに関するビューコントローラ
 */
@Controller
public class EventViewController extends AbstractViewController {

    @Autowired
    private EventDao eventDao;

    @Autowired
    private MessageSource messageSource;

    @RequestMapping(value = "/events", method = GET)
    public String get(final Model model, final Locale locale) {
        model.addAttribute(ModelConsts.MESSAGE_SOURCE, messageSource);
        model.addAttribute(ModelConsts.PREFECTURES, Arrays.asList(Prefecture.values()));        
        
        final List<EventDto> events = eventDao.selectAll();
        events.forEach(e -> {
            final Prefecture p = Prefecture.parse(e.getPrefectureId());
            e.setPrefectureName(p.getDisplayname(messageSource, locale));
        });
        model.addAttribute("events", events);
        return ".event.list";
    }

    @RequestMapping(value = "/events/{id}", method = GET)
    public String get(final Model model, final Locale locale, @PathVariable int id) {
        final EventDto event = eventDao.selectByPK(id);
        final Prefecture p = Prefecture.parse(event.getPrefectureId());
        event.setPrefectureName(p.getDisplayname(messageSource, locale));
        model.addAttribute("event", event);
        return ".event.info";
    }

}
