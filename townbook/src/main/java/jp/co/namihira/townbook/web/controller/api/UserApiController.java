/**
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.townbook.web.controller.api;

import javax.validation.Valid;

import jp.co.namihira.townbook.integration.dao.UserDao;
import jp.co.namihira.townbook.integration.dto.UserDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * user api controller
 */
@RestController
public class UserApiController extends AbstractApiController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/api/users", method = RequestMethod.POST)
    @Transactional(rollbackFor = Throwable.class)
    public UserDto post(@RequestBody @Valid UserDto dto){
        userDao.insert(dto);
        return dto;
    }

}
