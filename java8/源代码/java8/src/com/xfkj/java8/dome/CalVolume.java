package com.xfkj.java8.dome;
@FunctionalInterface
public interface CalVolume<T,R> {
     R cal(T t, T t2);
     default void show(){}
     static String get(){
          return "舒服的个人";
     }
}
