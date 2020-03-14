package com.xfkj.java8.dome.date;

import java.time.format.DateTimeFormatter;

public class BaseDateUtils {
   final  protected  static DateTimeFormatter dtf=DateTimeFormatter.ISO_LOCAL_DATE;
   final  protected  static DateTimeFormatter hms=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
   final  protected  static DateTimeFormatter ymd=DateTimeFormatter.ofPattern("yyyy-MM-dd");
}
