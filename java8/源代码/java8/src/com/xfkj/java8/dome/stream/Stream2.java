package com.xfkj.java8.dome.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream2  {
    public static void main(String[] args) {
        Integer [] num=new Integer[] {1,2,3,4,5};
        Arrays.stream(num).map(n->n*n).forEach(System.out::println);
        System.out.println("=====================");
        Arrays.stream(num).forEach(n->{
            n=n*n;
            System.out.println(n);
        });

    }

    private static void test1() {
        List<Integer> list=Arrays.asList(1,2,3,4,5);
        list= list.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(list);
        list.stream().forEach(System.out::println);
    }
}
