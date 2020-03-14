package com.xfkj.java8.dome.lambda;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class LambdaFunction {
    public static void main(String[] args) {
        Comparator<Integer> comparator=Integer::compare;

        comparator.compare(23,56);

    }

    private static void test4() {
        double calVolume = CalVolume(55, 66, (h, r) -> 2 * r * h * 3.15);
        System.out.println(calVolume);
    }

    private static void test3() {
        long sum = sum(45, 33, (x, y) -> x + y);
        System.out.println(sum);
    }

    private static void test2() {
        String aasdsd = operationStr("aasdsd", String::toUpperCase);
        System.out.println(aasdsd);
        String aasdet = operationStr("AASDET", (str) -> str.toLowerCase());
        System.out.println(aasdet);
    }

    private static void test1() {
        UnaryOperator<String> unaryOperator = (str) -> str.toUpperCase();
        String ertj = unaryOperator.apply("ertj");
        System.out.println(ertj);
    }

    /**
     * jdk8内置接口实现字符串操作
     *
     * @param str
     * @param operator
     * @return
     */
    public static String operationStr(String str, UnaryOperator<String> operator) {
        return operator.apply(str);
    }
    public static  long sum(long x, long y, BinaryOperator<Long> operator){
        return  operator.apply(x,y);
    }

    public static double CalVolume(long h, long r, BiFunction<Long,Long,Double> biFunction){
        return   biFunction.apply(h,r);
    }
}