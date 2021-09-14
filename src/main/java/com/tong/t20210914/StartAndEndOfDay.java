package com.tong.t20210914;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class StartAndEndOfDay {

    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        // 获取一天的开始时间
        LocalDateTime startOfTheDay = LocalDateTime.of(date.toLocalDate(), LocalTime.MIN);
        System.out.println("-----------");

        // 获取一天的结束时间
        LocalDateTime endOfTheDay = LocalDateTime.of(date.toLocalDate(), LocalTime.MAX);
        System.out.println("-----------");

    }
}
