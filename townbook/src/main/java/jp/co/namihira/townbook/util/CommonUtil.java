/*
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */

package jp.co.namihira.townbook.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * ユーティリティ処理クラス
 */
public class CommonUtil {

    public static <E> boolean isEmpty(Collection<E> c) {
        return c == null || c.size() == 0;
    }
    
    public static boolean isEmpty(final String str) {
        return str == null || str.isEmpty();
    }
    
    public static <T> List<T> list() {
        return new ArrayList<T>();
    }

}
