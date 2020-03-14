package com.xnky.taotao.builder;
/**
 * 鼠标类
 * @author 孙雪锋
 *
 */
public class mouse{
	private String brand;
	private String name;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void show() {
		System.out.println("该鼠标品牌为:"+brand);
		System.out.println("该鼠标名称为:"+name);
	}
}
