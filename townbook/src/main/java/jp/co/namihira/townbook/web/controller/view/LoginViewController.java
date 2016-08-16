/**
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.townbook.web.controller.view;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * login controller
 */
@Controller
public class LoginViewController extends AbstractViewController {

    @RequestMapping(value = "/login", method = GET)
    public String get(final Model model, @RequestParam(required = false, defaultValue = "") final String error) {
        model.addAttribute("isError", !error.isEmpty());
        return ".login";
    }

}
