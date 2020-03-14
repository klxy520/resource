package com.xnky.taotao.adpter.clas;

public class AdpterTest {

	public static void main(String[] args) {
		IPhone iPhone=new IPhone();
		IPhneHead iPhneHead=new ConnectAdpter();
		String connectComputer = iPhone.connectComputer(iPhneHead);
		System.out.println(connectComputer);
	}

}
