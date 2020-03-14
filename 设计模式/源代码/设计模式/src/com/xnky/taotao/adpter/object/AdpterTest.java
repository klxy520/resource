package com.xnky.taotao.adpter.object;

import com.xnky.taotao.adpter.clas.IPhneHead;
import com.xnky.taotao.adpter.clas.IPhone;
import com.xnky.taotao.adpter.clas.UsbHead;

public class AdpterTest {

	public static void main(String[] args) {
		IPhone iPhone=new IPhone();
		IPhneHead iPhneHead=new ConnectAdpter(new UsbHead());
		String connectComputer = iPhone.connectComputer(iPhneHead);
		System.out.println(connectComputer);
	}

}
