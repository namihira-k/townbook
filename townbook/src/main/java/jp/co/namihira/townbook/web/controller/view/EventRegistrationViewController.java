/**
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.townbook.web.controller.view;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.util.Arrays;

import jp.co.namihira.townbook.util.model.ModelConsts;
import jp.co.namihira.townbook.web.controller.view.AbstractViewController;
import jp.co.namihira.townbook.web.data.Prefecture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * イベント登録に関するコントローラ
 */
@Controller
public class EventRegistrationViewController extends AbstractViewController {

    @Autowired
    private MessageSource messageSource;
    
    @RequestMapping(value = "/events/registration", method = GET)
    public String get(final Model model) {
        model.addAttribute(ModelConsts.MESSAGE_SOURCE, messageSource);
        model.addAttribute(ModelConsts.PREFECTURES, Arrays.asList(Prefecture.values()));
        return ".event.registration";
    }

}
