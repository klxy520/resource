package com.xfkj.java8.dome.stream;

import com.xfkj.java8.dome.Person;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class TestStram3 {

    public static void main(String[] args) {
        Map<String, List<Person>> collect = getPersionList().stream().collect(Collectors.groupingBy(Person -> Person.getSex()));
        System.out.println(collect);
    }

    private static void test11() {
        Double collect = getPersionList().stream().collect(Collectors.summingDouble(Person::getSalary));
        System.out.println(collect);
    }

    private static void test10() {
        Double collect = getPersionList().stream().collect(Collectors.averagingDouble(Person::getSalary));
        getPersionList().stream().collect(Collectors.averagingDouble(Person::getSalary));
        System.out.println(collect);
    }

    private static void test9() {
        List<Person> persionList = getPersionList();
        persionList = persionList.stream().filter((person -> person.getSex().equals("男"))).collect(Collectors.toList());
        persionList.stream().forEach(System.out::println);
    }

    private static void test8() {
        List<String> collect = getPersionList().stream().map(Person::getName).collect(Collectors.toList());
        System.out.println(collect);
    }

    private static void tset2() {
        List<Person> persionList = getPersionList();
        Optional<Person> min = persionList.stream().min((p1, p2) -> {
            return Integer.compare(p1.getNum(), p2.getNum());
        });
        System.out.println(min);
    }

    private static void test7() {
        List<Person> persionList = getPersionList();
        Optional<Person> person = persionList.stream().max((p1, p2)-> Double.compare(p1.getSalary(), p2.getSalary()));
        System.out.println(person);
    }

    private static void test5() {
        List<Person> persionList = getPersionList();
        Optional<Person> max = persionList.stream().sorted((p1, p2)-> Double.compare(p2.getSalary(),p1.getSalary())).findFirst();
        System.out.println(max);
    }

    private static void tes6() {
        List<Person> persionList = getPersionList();
        persionList.stream().sorted((p1,p2)->Double.compare(p1.getSalary(),p2.getSalary())).forEach(System.out::println);
    }

    private static void test4() {
        getPersionList().stream().sorted((p1,p2)->-p1.getName().compareTo(p2.getName())).
                forEach(System.out::println);
    }

    private static void test3() {
        List<Person> persionList = getPersionList();
        persionList.stream().sorted((p1,p2)->{
            String sex = p1.getSex();
            String sex1 = p2.getSex();
            if(sex.equals(sex1)){
                return  Integer.compare(p1.getNum(),p2.getNum());
            }else {
                return sex.compareTo(sex1);
            }
        }).forEach(System.out::println);
    }

    private static void test1() {
        List<Person> personList = getPersionList();
        personList.stream().forEach(System.out::println);
    }

    public static List<Person> getPersionList(){
        List<Person> list=Arrays.asList(
                new Person(1,"男","小一",1000,3456.67),
                new Person(2,"男","小王",1200,34446.67),
                new Person(99,"女","张三",1030,34556.67),
                new Person(4,"男","张四",1000,3456.67),
                new Person(5,"女","小三",1040,34776.67),
                new Person(6,"男","李逵",1006,34577.67),
                new Person(7,"女","孙悟空",6080,34006.67),
                new Person(8,"男","猪八戒",6010,9999.67),
                new Person(9,"女","唐三藏",1400,334533.67),
                new Person(60,"男","黄晓明",1900,78977.55),
                new Person(11,"男","孙小小",1300,18975.67),
                new Person(52,"女","孟家",12300,5676876.67),
                new Person(13,"男","黄蓉",10340,24456.67),
                new Person(44,"女","张无忌",10560,12345.67),
                new Person(15,"男","赵敏",10044,45676.67),
                new Person(16,"男","杨逍",100456,365767.67),
                new Person(27,"女","陈晓",10066,57568.67),
                new Person(18,"男","唐一",1450,6854.67),
                new Person(19,"男","诸葛亮",16780,5765876.67)
        );
        return  list;
    }

}
