package com.xnky.taotao.build.improve;

import com.xnky.taotao.build.Computer;
import com.xnky.taotao.builder.IntelCpu;
import com.xnky.taotao.builder.LenovoMouse;
import com.xnky.taotao.builder.Monitor;

/**
 * 联想电脑建造者
 * @author 孙雪锋
 *
 */
public class LenovoComputerBuider implements ComputerBuilder{
	private Computer computer=new Computer();
	public LenovoComputerBuider() {
		computer.setName("联想");
	}
	@Override
	public void assembleCpu() {
		computer.setCpu(new IntelCpu());
	}

	@Override
	public void assembleMonitor() {
		// TODO Auto-generated method stub
		Monitor monitor=new Monitor();
		monitor.setBrand("联想显示器");
		monitor.setName("G480");
		computer.setMonitor(monitor);
	}

	@Override
	public void assembleHouse() {
		computer.setMouse(new LenovoMouse("联想鼠标"));
	}
	@Override
	public Computer assemble() {
		// TODO Auto-generated method stub
		return computer;
	}

}
