package com.xnky.taotao.appearance;

public class TestAppearance {

	
	 public static void main(String[] args) {
		 
		Cook cook=new Cook();
		System.out.println("===========煮饭步骤===========");
		cook.CookRice();
		cook.colseRiceCooker();
		System.out.println("===========炒菜步骤===========");
		cook.stirFry();
		cook.colseBench();
	}
}
