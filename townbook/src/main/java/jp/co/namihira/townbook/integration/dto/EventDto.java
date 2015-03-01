/*
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.townbook.integration.dto;

import lombok.Data;

@Data
public class EventDto {

    private int id;
    private String title;
    private String prefecture;
    private String town;
    private String content;

}
