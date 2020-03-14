package com.xnky.taotao.combination;

public abstract class ClothingManagement{
	private String brand;
	private  String name;
	public ClothingManagement(String brand, String name) {
		this.brand = brand;
		this.name = name;
	}
	public void add(ClothingManagement clothing) {
		throw new UnsupportedOperationException();
	}
	public void  delete(ClothingManagement clothing) {
		throw new UnsupportedOperationException();
	}
	protected abstract void show();
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

}
