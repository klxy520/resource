package com.xfkj.java8.dome;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 *已知有Integer[] arr = {-12345, 9999, 520, 0,-38,-7758520,941213}
 * a)使用lambda表达式创建Predicate对象p1,p1能判断整数是否是自然数(大于等于0)
 * b)使用lambda表达式创建Predicate对象p2,p2能判断整数的绝对值是否大于100
 * c)使用lambda表达式创建Predicate对象p3,p3能判断整数是否是偶数
 *
 * 遍历arr，仅利用已创建的Predicate对象(不使用任何逻辑运算符)，完成以下需求
 * i.打印自然数的个数
 * ii.打印负整数的个数
 * iii.打印绝对值大于100的偶数的个数
 * iv.打印是负整数或偶数的数的个数
 */
public class PedicateTest {
    static Integer[] arr = {-12345, 9999, 520, 0,-38,-7758520,941213};
    public static  void main(String[] args) {
        Supplier<List<Employee>> supplier=()->new ArrayList<Employee>();
        List<Employee> employees = supplier.get();
        Supplier<List<Employee>> supplier1=ArrayList::new;
        Function<Integer,List<Employee>> function=ArrayList::new;
        List<Employee> apply = function.apply(3);
        System.out.println(apply.size());
    }

    private static void test2() {
        test1(a->a>=0);
        System.out.println("================");
        System.out.println("================");
        test1(a->Math.abs(a)>100);
        System.out.println("================");
        test1(a->a%2==0||a<0);
    }

    private static void test1(Predicate<Integer> predicate) {
        Arrays.stream(arr).filter(predicate).forEach(System.out::println);
        long count = Arrays.stream(arr).filter(predicate).count();
        System.out.println(count);

    }

}
