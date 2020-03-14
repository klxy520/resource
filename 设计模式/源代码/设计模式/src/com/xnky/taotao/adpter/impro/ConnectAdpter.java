package com.xnky.taotao.adpter.impro;

import com.xnky.taotao.adpter.clas.UsbHead;

/**
 * 充电头适配器
 * @author 孙雪锋
 *
 */
public class ConnectAdpter {

	private UsbHead usbHead;


	public ConnectAdpter(UsbHead usbHead) {
		this.usbHead = usbHead;
	}


	public String connectPhone() {
		String computer = usbHead.connectComputer();
		return computer;
	}


}
