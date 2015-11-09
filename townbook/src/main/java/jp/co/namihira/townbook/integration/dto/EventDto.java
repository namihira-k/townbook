/*
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.townbook.integration.dto;

import java.time.LocalDateTime;

import lombok.Data;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Data
public class EventDto {

    private int id;
    private String title;
    private String prefectureId;
    private String prefectureName;
    private String place;
    private String content;
    @DateTimeFormat(iso = ISO.DATE_TIME)
    private LocalDateTime startDateTime;
    @DateTimeFormat(iso = ISO.DATE_TIME)
    private LocalDateTime endDateTime;
    private String url;

}
