package com.xnky.taotao.combination;

public class ClothingItems extends ClothingManagement{

	public ClothingItems(String brand, String name) {
		super(brand, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void show() {
		System.out.println(getName()+",买的品牌是"+getBrand());
	}

}
