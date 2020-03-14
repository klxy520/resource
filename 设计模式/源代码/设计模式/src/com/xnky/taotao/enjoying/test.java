package com.xnky.taotao.enjoying;

public class test {
	public static void main(String[] args) {
                ConstantFactory constantFactory=new ConstantFactory();
                StirngConstant constant = constantFactory.getConstant("java");
                constant.setName("小一");
                constant.show();
                StirngConstant constant2 = constantFactory.getConstant("C++");
                constant2.setName("小二");
                constant2.show();
                StirngConstant constant3 = constantFactory.getConstant("java")   ;
                constant3.setName("小三");
                constant3.show();
                StirngConstant constant4 = constantFactory.getConstant("java");
                constant4.setName("小四川");
                constant4.show();
                System.out.println(constantFactory.count());
	}
}
