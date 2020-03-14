package com.xnky.taotao.adpter.clas;
/**
 * 充电头适配器
 * @author 孙雪锋
 *
 */
public class ConnectAdpter extends UsbHead  implements IPhneHead {

	@Override
	public String connectPhone() {
		 String computer = connectComputer();
		return computer;
	}

}
