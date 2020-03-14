package com.xnky.taotao.factory.bean;

import java.io.Serializable;
/**
 * 工单基础类基础类
 * @author 孙雪锋
 *
 */
public class OrderBean  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String orderCode;
	private String type;
	private String name;
	
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void show() {
     System.out.println("该工单的code为："+orderCode);
     System.out.println("该工单的类型为："+type);
     System.out.println("该工单的名称为："+name);
	}
}
