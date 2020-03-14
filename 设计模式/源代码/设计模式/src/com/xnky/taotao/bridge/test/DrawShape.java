package com.xnky.taotao.bridge.test;

import com.xnky.taotao.bridge.test.Circle;

public class DrawShape {
    public static void main(String[] args) {
		Color color=new RedColor();
		Shape shape=new Circle(color);
		shape.coloring();
		System.out.println("==============");
		shape=new Rectangle(color);;
		shape.coloring();
	}
}
