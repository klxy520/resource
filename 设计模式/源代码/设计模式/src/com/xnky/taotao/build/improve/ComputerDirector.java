package com.xnky.taotao.build.improve;

import com.xnky.taotao.build.Computer;

//电脑指挥者
public class ComputerDirector {
	private ComputerBuilder computerBuilder;

	public void setComputerBuilder(ComputerBuilder computerBuilder) {
		this.computerBuilder = computerBuilder;
	}

	public ComputerDirector(ComputerBuilder computerBuilder) {
		super();
		this.computerBuilder = computerBuilder;
	}

	public Computer buildComputer() {
		computerBuilder.assembleCpu();
		computerBuilder.assembleMonitor();
		computerBuilder.assembleHouse();
		Computer computer = computerBuilder.assemble();
		return computer;
	}
}
