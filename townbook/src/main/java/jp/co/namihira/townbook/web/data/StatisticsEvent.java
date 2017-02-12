/**
 * Copyright 2017 Kosuke Namihira All Rights Reserved.
 */

package jp.co.namihira.townbook.web.data;

import java.util.List;

import lombok.Data;

@Data
public class StatisticsEvent {

    private int totalCount;
    private List<StatisticsPrefEvent> prefEvents;

}
