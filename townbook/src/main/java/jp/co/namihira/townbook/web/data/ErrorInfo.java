/*
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.townbook.web.data;

import lombok.Data;

@Data
public class ErrorInfo {

    private String message;

    public ErrorInfo(final String message){
        this.message = message;
    }

}
