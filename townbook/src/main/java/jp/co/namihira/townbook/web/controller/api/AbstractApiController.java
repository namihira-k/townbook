/**
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.townbook.web.controller.api;

import jp.co.namihira.townbook.web.data.ErrorInfo;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * API関連のコントローラの抽象クラス
 */
public abstract class AbstractApiController {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    private ErrorInfo handleException(MethodArgumentNotValidException e){
        return new ErrorInfo(e.getMessage());
    }

}
