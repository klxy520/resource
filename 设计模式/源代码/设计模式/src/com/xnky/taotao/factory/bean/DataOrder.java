package com.xnky.taotao.factory.bean;
/**
 * 数据提取工单
 * @author 孙雪锋
 *
 */
public class DataOrder extends OrderBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public DataOrder(String code) {
		super.setOrderCode(code);
		setType("数据提取工单");
	}
}
