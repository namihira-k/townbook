/*
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */

package jp.co.namihira.townbook.util;

import java.time.format.DateTimeFormatter;

public class DateTimeUtil {

    private static final String FORMAT_DATETIME = "yyyy-MM-dd hh:mm";

    public static DateTimeFormatter getDateTimeFormatter() {
        return DateTimeFormatter.ofPattern(FORMAT_DATETIME);
    }

}
