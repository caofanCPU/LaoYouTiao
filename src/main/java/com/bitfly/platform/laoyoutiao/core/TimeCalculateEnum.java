package com.bitfly.platform.laoyoutiao.core;

/**
 * Wonderful Time calculator
 *
 * @author D8GER
 */
public enum TimeCalculateEnum {
    PLUS('+', "now+"),
    MINUS('-', "now-"),
    YEAR('Y', "year"),
    MONTH('M', "month"),
    DAY('d', "day"),
    HOUR('h', "hour"),
    MINUTE('m', "minute"),
    SECOND('s', "second"),
    MILLISECOND('.', "millisecond");

    private final char key;

    private final String title;

    TimeCalculateEnum(char key, String title) {
        this.key = key;
        this.title = title;
    }

    public char getKey() {
        return key;
    }

    public String getTitle() {
        return title;
    }

}
