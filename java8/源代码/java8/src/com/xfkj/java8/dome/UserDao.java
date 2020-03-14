package com.xfkj.java8.dome;

public interface UserDao {
    default String selectByName(){
        return "hello,word!";
    }
}
