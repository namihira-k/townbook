/**
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.townbook.web.controller.api;

import jp.co.namihira.townbook.exception.NoDataException;
import jp.co.namihira.townbook.web.data.ErrorInfo;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * API関連のコントローラの抽象クラス
 */
@Controller
@RequestMapping(value = "/api")
public abstract class AbstractApiController {

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    private ErrorInfo handleException(final RuntimeException e) {
        return new ErrorInfo(e.getMessage());
    }

    @ExceptionHandler(NoDataException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    private ErrorInfo handleException(final NoDataException e){
        return new ErrorInfo(e.getMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    private ErrorInfo handleException(final MethodArgumentNotValidException e){
        return new ErrorInfo(e.getMessage());
    }

}
