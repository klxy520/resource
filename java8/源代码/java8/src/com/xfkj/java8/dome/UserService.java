package com.xfkj.java8.dome;

public interface UserService  {
    default String selectByName(){
        return "hello,java8!";
    }
}
