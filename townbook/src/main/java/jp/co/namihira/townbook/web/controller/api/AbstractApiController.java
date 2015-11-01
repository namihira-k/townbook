/**
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.townbook.web.controller.api;

import jp.co.namihira.townbook.exception.NoDataException;
import jp.co.namihira.townbook.web.data.ErrorInfo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * API関連のコントローラの抽象クラス
 */
public abstract class AbstractApiController {

    @ExceptionHandler(NoDataException.class)
    @ResponseStatus(value=HttpStatus.NOT_FOUND)
    private ErrorInfo handleException(NoDataException e){
        return new ErrorInfo(e.getMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    private ErrorInfo handleException(MethodArgumentNotValidException e){
        return new ErrorInfo(e.getMessage());
    }

}
