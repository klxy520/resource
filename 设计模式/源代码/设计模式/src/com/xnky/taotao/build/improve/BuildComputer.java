package com.xnky.taotao.build.improve;

import com.xnky.taotao.build.Computer;

public class BuildComputer {

	public static void main(String[] args) {
		ComputerBuilder ASUSbuilder=new ASUSComputerBuilder();
		ComputerDirector director=new ComputerDirector(ASUSbuilder);
		Computer computer = director.buildComputer();
		computer.show();
		System.out.println("========================");
		ComputerBuilder lenovobuilder=new LenovoComputerBuider();
		director.setComputerBuilder(lenovobuilder);
		Computer  lenovocComputer= director.buildComputer();
		lenovocComputer.show();
	}

}
