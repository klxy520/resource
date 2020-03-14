package com.xnky.taotao.adpter.object;

import com.xnky.taotao.adpter.clas.IPhneHead;
import com.xnky.taotao.adpter.clas.UsbHead;

/**
 * 充电头适配器
 * @author 孙雪锋
 *
 */
public class ConnectAdpter  implements IPhneHead {
   
	private UsbHead usbHead;
	
	
	public ConnectAdpter(UsbHead usbHead) {
		this.usbHead = usbHead;
	}


	@Override
	public String connectPhone() {
		 String computer = usbHead.connectComputer();
		return computer;
	}

}
