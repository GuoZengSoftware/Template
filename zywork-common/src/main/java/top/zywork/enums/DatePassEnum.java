package top.zywork.enums;

/**
 * Created by Wang Genshen on 2017-08-16.
 */
public enum DatePassEnum {
    SECONDS_PASS("秒前"),
    MINUTES_PASS("分钟前"),
    HOURS_PASS("小时前"),
    YESTERDAY("昨天"),
    DAYS_PASS("天前");

    private String value;

    DatePassEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
