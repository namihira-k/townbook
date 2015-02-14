/**
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.townbook.web.controller;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * イベントに関するコントローラ
 */
@Controller
public class EventController {

    @RequestMapping(value = "/event", method = GET)
    public String get() {
        return "event";
    }

    @RequestMapping(value = "/event", method = POST)
    public String post() {
        return "event";
    }

}
