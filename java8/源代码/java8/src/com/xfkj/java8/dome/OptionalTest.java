package com.xfkj.java8.dome;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Optional<Person> person = Optional.ofNullable(new Person("男", "宁采臣"));
        Optional<String> s = person.flatMap(person1 -> {
            return Optional.of(person1.getName());
        });
        System.out.println(s.get());


    }

    private static void test6() {
        Optional<Person> person = Optional.ofNullable(new Person("男", "宁采臣"));
        Optional<String> optional = person.map(Person::getName);
        System.out.println(optional.get());
        System.out.println("========================");
        Optional<Object> empty = Optional.empty();

        Optional<String> stringOptional = empty.map((st) -> "孙雪锋");
        if (stringOptional.isPresent())
        System.out.println(stringOptional.get());
    }

    private static void test4() {
        Optional<Object> optional = Optional.ofNullable(null);
        if (optional.isPresent())
            System.out.println(optional.get());
          else {
            Object o = optional.orElseGet(Person::new);
            System.out.println(o);
        }
    }

    private static void test3() {
        Optional<Person> person = Optional.ofNullable(new Person("女", "芳芳"));
        System.out.println(person.get());
        System.out.println(person);
        System.out.println("================");
        Optional<Object> o = Optional.ofNullable(null);
        System.out.println(o);
        if (o.isPresent())
        System.out.println(o.get());
    }

    private static void test2() {
        Optional<Object> empty = Optional.empty();
        System.out.println(empty);
        if (empty.isPresent()) {
            System.out.println(empty.get());
        }
        else
            System.out.println(empty.orElse(new Person("女","芳芳")));
    }

    private static void test1() {
//        Optional<Person> person = Optional.of(new Person());
//        System.out.println(person.get());
//        System.out.println("=====================");
        Optional<Object> optional = Optional.of(null);//报错无法向下执行
        if (optional.isPresent())
        System.out.println(optional.orElse(new Person("女","芳芳")));
        System.out.println(optional.get());
    }
}
