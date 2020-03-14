package com.xfkj.java8.dome;

public class TestJava8 implements UserDao ,UserService{
    @Override
    public String selectByName() {
        return UserService.super.selectByName();
    }
}
