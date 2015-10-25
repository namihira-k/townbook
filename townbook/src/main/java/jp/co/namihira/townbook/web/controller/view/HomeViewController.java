/**
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.townbook.web.controller.view;

import static org.springframework.web.bind.annotation.RequestMethod.*;
import jp.co.namihira.townbook.web.controller.view.AbstractViewController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ホーム画面に関するコントローラ
 */
@Controller
public class HomeViewController extends AbstractViewController {

    @RequestMapping(value = "/home", method = GET)
    public String get() {
        return ".home";
    }

}
