package com.xnky.taotao.bridge.test2;

public class Circle extends Shape{

	public Circle(String className) {
		super(className);
		// TODO Auto-generated constructor stub
	}
   public void coloring() {
	  System.out.print("画正方形");
	  super.coloring();
   }
}
