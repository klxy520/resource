package com.xnky.taotao.bridge.test;

import com.xnky.taotao.bridge.test.Color;
import com.xnky.taotao.bridge.test.Shape;

public class Circle extends Shape{

	public Circle(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}
   public void coloring() {
	  System.out.print("画正方形");
	  super.coloring();
   }
}
