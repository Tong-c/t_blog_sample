package com.tong.t20210903;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StringToLocalDateTime {
    public static void main(String[] args) {
        String dateStr = "2021-09-03 21:00:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime parsedDate = LocalDateTime.parse(dateStr, formatter);
        System.out.println("-----------");

        String dateStr2 = "2021-09-03";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate parsedDate2 = LocalDate.parse(dateStr2, formatter2);
        System.out.println("-----------");
    }
}
