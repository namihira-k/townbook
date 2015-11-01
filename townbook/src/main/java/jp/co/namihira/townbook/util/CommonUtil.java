/*
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */

package jp.co.namihira.townbook.util;

import java.util.Collection;

/**
 * ユーティリティ処理クラス
 */
public class CommonUtil {

    public static <E> boolean isEmpty(Collection<E> c) {
        return c == null || c.size() == 0;
    }

}
