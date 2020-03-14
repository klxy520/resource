package com.xfkj.java8.dome.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream4 {

   static List<Integer> list=Arrays.asList(23,78,45,67,88,55,65);

    public static void main(String[] args) {
      //  list.stream().collect(Collectors.averagingInt(List::get));
    }

    private static void test1() {
        Integer reduce = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println(reduce);
    }
}
