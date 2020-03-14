package com.xnky.taotao.factory.bean;
/**
 * 运行工单
 * @author 孙雪锋
 *
 */
public class RunOrder extends OrderBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public RunOrder(String code) {
		super.setOrderCode(code);
		setType("运行工单");
	}
}
