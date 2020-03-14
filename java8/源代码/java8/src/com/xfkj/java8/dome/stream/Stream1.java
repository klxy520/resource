package com.xfkj.java8.dome.stream;

import com.xfkj.java8.dome.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * stream api 学习
 */
public class Stream1 {
    static List<Employee> emps = Arrays.asList(
            new Employee(101, "张三", 18, 9999.99),
            new Employee(102, "李四", 59, 6666.66),
            new Employee(103, "王五", 28, 3333.33),
            new Employee(104, "赵六", 8, 7777.77),
            new Employee(105, "小一", 5, 2000),
            new Employee(105, "小二", 6, 50000),
            new Employee(105, "小三", 78, 5647),
            new Employee(105, "小四", 23, 6789)
    );
    public static void main(String[] args) {
        List<Integer> stream = emps.stream().map(employee -> employee.getAge()).collect(Collectors.toList());
        System.out.println(stream);


    }

    private static void test6() {
        List<Employee> employeeList = emps.stream().filter((employee) -> employee.getAge() > 20).collect(Collectors.toList());
        System.out.println("===================");
        employeeList.stream().forEach(System.out::println);
        System.out.println("===================");
        employeeList.stream().limit(2).forEach(employee -> System.out.println(employee));
        System.out.println("===================");
        employeeList.stream().skip(3).forEach(System.out::println);
    }

    private static void test5() {
        Stream<Double> generate = Stream.generate(Math::random);
        generate.limit(3).forEach(System.out::println);
    }

    private static void test4() {
        Stream<Integer> iterate = Stream.iterate(0, Math::abs);
        iterate.forEach(System.out::println);
    }

    private static void test3() {
        Stream<Integer> stream = Stream.of(5, 6, 6, 89, 9);
        stream.forEach(System.out::println);
    }

    private static void test2() {
        String [] names=new String[]{"AA","VV","CC","DD","EE"};
        Stream<String> stream = Arrays.stream(names);
        stream.forEach(System.out::println);
    }

    private static void test() {
        Stream<Employee> stream = emps.stream();
        Stream<Employee> employeeStream = emps.parallelStream();
    }

}
