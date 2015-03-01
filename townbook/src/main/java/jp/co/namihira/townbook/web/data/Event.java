/*
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.townbook.web.data;

import lombok.Data;

@Data
public class Event {

    private String title;
    private String prefecture;
    private String town;
    private String content;

}
