package com.xnky.taotao.decorator;

public class CoffeeCliet {

	public static void main(String[] args) {
		Drink coffe=new EspressoCoffee();
		System.out.println("========没有添加调料=============");
		System.out.println("价格:"+coffe.cost());
		System.out.println("描述:"+coffe.getDec());
		coffe= new Milk(coffe);
		System.out.println("========添加牛奶调料=============");
		System.out.println("价格:"+coffe.cost());
		System.out.println("描述:"+coffe.getDec());
		coffe=new Soy(coffe);
		System.out.println("========添加豆浆调料=============");
		System.out.println("价格:"+coffe.cost());
		System.out.println("描述:"+coffe.getDec());
	}

}
