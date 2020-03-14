package com.xnky.taotao.build;

import com.xnky.taotao.build.Computer;
import com.xnky.taotao.build.ComputerBuilder;

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
		Computer computer = computerBuilder.assemble();
		computer.setCpu(computerBuilder.assembleCpu());
		computer.setMonitor(computerBuilder.assembleMonitor());
		computer.setMouse(computerBuilder.assembleHouse());
		return computer;
	}
}
