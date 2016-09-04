/*
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.townbook.web.data;

import java.util.Locale;

import org.springframework.context.MessageSource;

public enum Prefecture {

    HOKKAIDO(),
    AOMORI(),
    IWATE(),
    MIYAGI(),
    AKITA(),
    YAMAGATA(),
    FUKUSHIMA(),
    IBARAKI(),
    TOCHIGI(),
    GUNMA(),
    SAITAMA(),
    CHIBA(),
    TOKYO(),
    KANAGAWA(),
    NIIGATA(),
    TOYAMA(),
    ISHIKAWA(),
    FUKUI(),
    YAMANASHI(),
    NAGANO(),
    GIFU(),
    SHIZUOKA(),
    AICHI(),
    MIE(),
    SHIGA(),
    KYOTO(),
    OHSAKA(),
    HYOGO(),
    NARA(),
    WAKAYAMA(),
    TOTTORI(),
    SHIMANE(),
    OKAYAMA(),
    HIROSHIMA(),
    YAMAGUCHI(),
    TOKUSHIMA(),
    KAGAWA(),
    EHIME(),
    KOHTI(),
    FUKUOKA(),
    SAGA(),
    NAGASAKI(),
    KUMAMOTO(),
    OHITA(),
    MIYAZAKI(),
    KAGOSHIMA(),
    OKINAWA();
    
    private final String id;
    
    private Prefecture() {
        this.id = name().toLowerCase();
    }
    
    public String getId(){
        return id;
    }

    public String getDisplayname(final MessageSource messageSource, final Locale locale){
        return messageSource.getMessage("prefecture." + this.name().toLowerCase(), null, locale);
    }

    public static Prefecture parse(final String prefectureId) {
        return Prefecture.valueOf(prefectureId.toUpperCase());
    }
    
    public boolean isDefault(){
        return this == TOKYO;
    }

}
