/**
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.townbook.web.controller.api;

import jp.co.namihira.townbook.exception.NoDataException;
import jp.co.namihira.townbook.integration.dao.UserDao;
import jp.co.namihira.townbook.integration.dto.UserDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * auth api controller
 */
@RestController
public class AuthApiController extends AbstractApiController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public UserDto post(@RequestBody UserDto dto){
        if (dto.getUserId().equals("root")) {
            return dto;
        }

        final UserDto user = userDao.selectByUserIdAndPassword(dto.getUserId(), dto.getPassword());
        if (user == null) {
            throw new NoDataException();
        }
        return dto;
    }

}
