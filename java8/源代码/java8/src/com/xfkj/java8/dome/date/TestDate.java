package com.xfkj.java8.dome.date;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class TestDate {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        System.out.println(dateTimeFormatter.format(now));
         dateTimeFormatter=DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(dateTimeFormatter.format(now));
         dateTimeFormatter=DateTimeFormatter.ISO_DATE_TIME;
        System.out.println(dateTimeFormatter.format(now));
         dateTimeFormatter=DateTimeFormatter.ISO_DATE;
        System.out.println(dateTimeFormatter.format(now));
         dateTimeFormatter=DateTimeFormatter.ISO_OFFSET_DATE_TIME;
       // System.out.println(dateTimeFormatter.format(now));
         dateTimeFormatter=DateTimeFormatter.ISO_OFFSET_DATE;
        //System.out.println(dateTimeFormatter.format(now));
//        dateTimeFormatter=DateTimeFormatter.ISO_INSTANT;
//        System.out.println(dateTimeFormatter.format(now));
//        dateTimeFormatter=DateTimeFormatter.ISO_WEEK_DATE;
//        System.out.println(dateTimeFormatter.format(now));
//        dateTimeFormatter=DateTimeFormatter.ISO_ORDINAL_DATE;
//        System.out.println(dateTimeFormatter.format(now));
    }

    private static void test4() {
        LocalDateTime now = LocalDateTime.now();
        now = now.plusYears(3);//加上3年
        now=now.plusMonths(3);//加上3月
        now=now.plusDays(3);//加上3天
        now=now.plusHours(3);//加上3小时
        now=now.plusMinutes(15);//加上15分钟
        now=now.plusSeconds(15);//加上15秒钟
        now=now.plusNanos(16);//加上16纳秒
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateTimeFormatter.format(now));
    }

    private static void test5() {
        LocalDateTime now = LocalDateTime.now();
        now = now.minusYears(3);//减去3年
        now=now.minusMonths(3);//减去3月
        now=now.minusDays(3);//减去3天
        now=now.minusHours(3);//减去3小时
        now=now.minusMinutes(15);//减去15分钟
        now=now.minusSeconds(15);//减去15秒钟
        now=now.minusNanos(16);//减去16纳秒
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateTimeFormatter.format(now));
    }

    private static void test3() {
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime minus = localDateTime.minusDays(3);
        String format = dateTimeFormatter.format(minus);
        System.out.println("减去3天"+format);
        LocalDateTime dateTime = localDateTime.minusHours(12);
        String format1 = dateTimeFormatter.format(dateTime);
        System.out.println("减去12个小时"+format1);
    }

    private static void test2() {
        LocalDateTime of = LocalDateTime.of(1990, 12, 05, 14, 00, 0);
        System.out.println(of.getYear());
        System.out.println(of.getMonthValue());
        System.out.println(of.getMonth().getValue());
        System.out.println(of.getDayOfMonth());
        System.out.println(of.getHour());
        System.out.println(of.getMinute());
        System.out.println(of.getSecond());
        System.out.println(of.getDayOfWeek().getValue());
    }

    private static void test1() {
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime);
        int dayOfYear = localDateTime.getDayOfYear();
        System.out.println("获得日期字段:"+dayOfYear);
        System.out.println("获取多号:"+localDateTime.getDayOfMonth());
        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
        System.out.println("获取星期几字段:"+dayOfWeek.getValue());
        System.out.println("获取小时字段:"+localDateTime.getHour());
        System.out.println("获取分钟字段："+localDateTime.getMinute());
        System.out.println("获得秒钟的字段:"+localDateTime.getSecond());
        Month month = localDateTime.getMonth();
        System.out.println("获得月份:"+month.getValue());
        System.out.println("月份:"+localDateTime.getMonthValue());
    }
}
