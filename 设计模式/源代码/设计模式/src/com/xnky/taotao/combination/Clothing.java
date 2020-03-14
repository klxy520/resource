package com.xnky.taotao.combination;

import java.util.ArrayList;
import java.util.List;

public class Clothing  extends ClothingManagement{

	private List<ClothingManagement>list=new ArrayList<ClothingManagement>();

	public Clothing(String brand, String name) {
		super(brand, name);
	}
	@Override
	public void add(ClothingManagement clothing) {
		list.add(clothing);
	}
	@Override
	public void delete(ClothingManagement clothing) {
		list.remove(clothing);
	}
	@Override
	public void show() {
		System.out.println("我们是:"+getName()+",买的品牌是"+getBrand());
		if (list.size()>0) {
			list.forEach(clothing->{
				clothing.show();
			});
		}
	}
}
