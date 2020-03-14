package com.xnky.taotao.strategy;

import java.util.function.BinaryOperator;

public class Test {
    public static void main(String[] args) {
        test2();
    }

    private static void test2() {
        int i = cal1(55, 67, (x, y) -> x * y);
        System.out.println(i);
        int i1 = cal1(55, 67, (x, y) -> x + y);
        System.out.println(i1);
    }

    private static void test1() {
        int cal = cal(3, 5, new Subtraction());
        int cal1 = cal(3, 5, new Addition());
        System.out.println("CAL"+cal);
        int cal2 = cal(4, 5, (x, y) -> x + y);
        System.out.println(cal2);
        System.out.println("CAL1" + cal1);
    }

    /**
     *自己写接口
     * @param x
     * @param y
     * @param calculationStrategy
     * @return
     */
    public static int cal(int x,int y, CalculationStrategy calculationStrategy){
        return  calculationStrategy.Calculation(x,y);

    }

    /**
     * java8内置接口
     * @param x
     * @param y
     * @param
     * @return
     */
    public static int cal1(int x, int y, BinaryOperator<Integer> binaryOperator){
        return binaryOperator.apply(x,y);
    }

}
