package com.xnky.taotao.combination;

public class Test {

	public static void main(String[] args) {
	   ClothingManagement manClothing=new ClothingProject("A", "男装");
	   manClothing.add(new ClothingItems("AA", "男装A"));
	   manClothing.add(new ClothingItems("AC", "男装C"));
	   manClothing.add(new ClothingItems("AD", "男装D"));
	   manClothing.add(new ClothingItems("AB", "男装B"));
	   ClothingManagement womanClothing=new ClothingProject("B", "女装");
	   womanClothing.add(new ClothingItems("BA", "女装A"));
	   womanClothing.add(new ClothingItems("BB", "女装B"));
	   womanClothing.add(new ClothingItems("BC", "女装C"));
	   womanClothing.add(new ClothingItems("BD", "女装D"));
	   ClothingManagement clothingManagement=new Clothing("七匹狼", "七匹狼旗舰店");
	   clothingManagement.add(manClothing);
	   clothingManagement.add(womanClothing);
	   clothingManagement.show();
	}

}
