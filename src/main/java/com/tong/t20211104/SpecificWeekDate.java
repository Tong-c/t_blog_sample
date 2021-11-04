package com.tong.t20211104;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class SpecificWeekDate {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();

        // 查询下一周的周四
        System.out.println(getSpecificWeekDate(date, 1, 4));

        // 查询下一周的周三
        System.out.println(getSpecificWeekDate(date, 1, 3));

        // 查询本周的周四
        System.out.println(getSpecificWeekDate(date, 0, 4));

        // 查询两周后的周四
        System.out.println(getSpecificWeekDate(date, 2, 4));
    }


    public static LocalDateTime getSpecificWeekDate(LocalDateTime date, int weeks, int dayOfWeek) {
        return date.plusWeeks(weeks - 1).with(TemporalAdjusters.next(DayOfWeek.of(dayOfWeek)));
    }
}
