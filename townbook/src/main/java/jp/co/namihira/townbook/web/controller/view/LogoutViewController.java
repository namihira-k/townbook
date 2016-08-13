/**
 * Copyright 2016 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.townbook.web.controller.view;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * logout controller
 */
@Controller
public class LogoutViewController extends AbstractViewController {

    @RequestMapping(value = "/logout", method = GET)
    public String get() {
        return ".logout";
    }

}
