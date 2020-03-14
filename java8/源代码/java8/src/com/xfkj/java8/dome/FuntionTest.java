package com.xfkj.java8.dome;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FuntionTest {
    static List<Integer> list=Arrays.asList(34,78,48,556,8778,4688);
    static  List<String> strings=Arrays.asList("黄药师", "冯蘅", "郭靖", "黄蓉", "郭芙", "郭襄", "郭破虏"
            ,"陈玄风","陆乘风","陆乘风","曲灵风","武眠风","冯默风","罗玉风");

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, -2, -3, 4, -5);
        List<Integer> collect = stream.map(Math::abs).collect(Collectors.toList());
        System.out.println(collect);
    }

    private static void test5() {
//        Set<String> strings = FuntionTest.strings.stream().map(str -> {
//            if (str.endsWith("风")) {
//                return str + ",是黄药师的徒弟";
//            } else {
//                return str;
//            }
//        });
    }

    private static void test4() {
        LinkedHashSet<String> strings = FuntionTest.strings.stream().skip(3).collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(strings);
    }


    private static void test3() {
        strings.stream().map((x)->{
           if (x.startsWith("郭"))
               return x.substring(0,3);
           else
               return x;
        }).forEach(System.out::println);
    }

    private static void test2() {
        List<String> newList=new ArrayList<String>();
        strings.stream().forEach(str->{
            if (str.startsWith("郭")){
                newList.add(str);
            }
        });
        System.out.println(newList);
    }

    public static  Integer avg(List<Integer> list,Function<List<Integer>,Integer> function){
        return function.apply(list);
    }
}
