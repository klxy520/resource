package com.xnky.taotao.bridge.test2;

import com.xnky.taotao.bridge.test.Color;

public abstract class Shape {
	private Color color;
	public Shape(String className) {
		try {
			this.color=(Color) Class.forName(className).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void coloring() {
		System.out.println(" 涂:"+color.Coloring());
	}                                                        
}
