/**
 * Copyright 2017 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.townbook.web.controller.api;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.namihira.townbook.integration.dao.EventDao;
import jp.co.namihira.townbook.web.data.StatisticsEvent;

/**
 * Controller for statistics of events
 */
@RestController
public class StatisticsEventApiController extends AbstractApiController {

    @Autowired
    private EventDao eventDao;

    @RequestMapping(value = "/statistics/event", method = GET)
    public StatisticsEvent get() {
        final StatisticsEvent statsEvent = new StatisticsEvent();

        statsEvent.setTotalCount(eventDao.countAll());

        return statsEvent;
    }

}
