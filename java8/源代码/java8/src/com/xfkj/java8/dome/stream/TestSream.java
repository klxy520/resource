package com.xfkj.java8.dome.stream;

import com.xfkj.java8.dome.Trader;
import com.xfkj.java8.dome.Transaction;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestSream {
   static Trader raoul = new Trader("Raoul", "Cambridge");
    static Trader mario = new Trader("Mario", "Milan");
    static Trader alan = new Trader("Alan", "Cambridge");
    static  Trader brian = new Trader("Brian", "Cambridge");
   static List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
    );

    /***
     * //8. 找到交易额最小的交易
     * 	//7. 所有交易中，最高的交易额是多少
     * 	//6. 打印生活在剑桥的交易员的所有交易额
     * 	//5. 有没有交易员是在米兰工作的？
     * 	//4. 返回所有交易员的姓名字符串，按字母顺序排序
     * 	//3. 查找所有来自剑桥的交易员，并按姓名排序
     * 	//2. 交易员都在哪些不同的城市工作过？
     * 	//1. 找出2011年发生的所有交易， 并按交易额排序（从低到高）
     * @param args
     */
    public static void main(String[] args) {
        Optional<Integer> min = transactions.stream().map(Transaction::getValue).min(Integer::compareTo);
        System.out.println(min.get());
    }

    private static void test8() {
        Optional<Integer> max = transactions.stream().map(Transaction::getValue).max(Integer::compareTo);
        System.out.println(max.get());
    }

    private static void test7() {
        Optional<Integer> first = transactions.stream().map(Transaction::getValue).sorted((v1, v2)->-Integer.compare(v1,v2)).findFirst();
        System.out.println(first.get());
    }

    private static void test6() {
        ArrayList<Integer> collect = transactions.stream().filter(transaction -> "Cambridge".equals(transaction.getTrader().getCity()))
                .map(Transaction::getValue).sorted(Integer::compareTo).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(collect);
    }

    private static void test5() {
        boolean noneMatch = transactions.stream().anyMatch(transaction -> "Milan".equals(transaction.getTrader().getCity()));
        System.out.println(noneMatch);
    }

    private static void test4() {
        List<String> collect = transactions.stream().map(transaction -> transaction.getTrader().getName()).sorted(String::compareTo)
                .distinct().collect(Collectors.toList());
        System.out.println(collect);
    }

    private static void test3() {
        Set<String> collect = transactions.stream().filter(transaction -> "Cambridge".equals(transaction.getTrader().getCity()))
                .map(transaction -> transaction.getTrader().getName()).sorted(String::compareTo).distinct().collect(Collectors.toSet());
        System.out.println(collect);
    }

    private static void test2() {
        HashSet<String> hashSet = transactions.stream().map(transaction -> transaction.getTrader().getCity()).
                collect(Collectors.toCollection(HashSet::new));
        System.out.println(hashSet);
    }

    private static void test1() {
        ArrayList<Transaction> collect = transactions.stream().filter(transaction -> transaction.getYear() == 2011)
                .sorted((t1, t2) -> Integer.compare(t1.getValue(), t2.getValue())
                ).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(collect);
    }


}
