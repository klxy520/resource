package com.xnky.taotao.build.improve;

import com.xnky.taotao.build.Computer;
import com.xnky.taotao.builder.AmdCpu;
import com.xnky.taotao.builder.Monitor;
import com.xnky.taotao.builder.OodvjMouse;

public class ASUSComputerBuilder  implements ComputerBuilder{
	private Computer computer;
	public ASUSComputerBuilder() {
		computer=new Computer();
		computer.setName("华硕");
	}

	@Override
	public void assembleCpu() {
		computer.setCpu(new AmdCpu("amdCPU"));
	}

	@Override
	public void assembleMonitor() {
		Monitor monitor=new Monitor();
		monitor.setBrand("华硕显示器");
		monitor.setName("华硕");
		computer.setMonitor(monitor);
	}

	@Override
	public void assembleHouse() {
		computer.setMouse(new OodvjMouse("雷柏"));
	}

	@Override
	public Computer assemble() {
		return computer;
	}

}
