/**
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.townbook.web.controller.view;

import static org.springframework.web.bind.annotation.RequestMethod.*;
import jp.co.namihira.townbook.web.controller.view.AbstractViewController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * イベント登録に関するコントローラ
 */
@Controller
public class EventRegistrationViewController extends AbstractViewController {

    @RequestMapping(value = "/events/registration", method = GET)
    public String get() {
        return ".event.registration";
    }

}
