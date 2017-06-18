/*
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.townbook.integration.dto;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jp.co.namihira.townbook.util.DateTimeUtil;
import lombok.Data;

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
    private String startDateTimeStr;
    @DateTimeFormat(iso = ISO.DATE_TIME)
    private LocalDateTime endDateTime;
    private String endDateTimeStr;
    private String url;

    public String getStartDateTimeStr() {
        return startDateTime.format(DateTimeUtil.getDateTimeFormatter());
    }

    public String getEndDateTimeStr() {
        return endDateTime.format(DateTimeUtil.getDateTimeFormatter());
    }

}
