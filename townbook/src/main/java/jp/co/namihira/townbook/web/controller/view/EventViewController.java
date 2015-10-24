/**
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.townbook.web.controller.view;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.util.Locale;

import jp.co.namihira.townbook.integration.dao.EventDao;
import jp.co.namihira.townbook.integration.dto.EventDto;
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
public class EventViewController {

    @Autowired
    private EventDao eventDao;

    @Autowired
    private MessageSource messageSource;

    @RequestMapping(value = "/view/events/{id}", method = GET)
    public String get(Locale locale, Model model, @PathVariable int id) {
        final EventDto event = eventDao.selectByPK(id);
        final Prefecture p = Prefecture.parse(event.getPrefectureId());
        event.setPrefectureName(p.getDisplayname(messageSource, locale));
        model.addAttribute("event", event);
        return "event.info";
    }

}
