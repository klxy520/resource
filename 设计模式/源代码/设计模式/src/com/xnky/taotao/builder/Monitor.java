package com.xnky.taotao.builder;

public class Monitor {
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
		System.out.println("该显示器品牌为:"+brand);
		System.out.println("该显示器名称为:"+name);
	}
}
