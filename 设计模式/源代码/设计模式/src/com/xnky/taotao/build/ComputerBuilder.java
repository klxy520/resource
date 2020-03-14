package com.xnky.taotao.build;

import com.xnky.taotao.builder.CPU;
import com.xnky.taotao.builder.Monitor;
import com.xnky.taotao.builder.mouse;

/**
 * 电脑建造者
 * 
 * @author 孙雪锋
 *
 */
public abstract class ComputerBuilder {
	Computer computer = new Computer();
	
	public Computer assemble() {
		return computer;
	}

	public abstract CPU assembleCpu();

	public abstract Monitor assembleMonitor();

	public abstract mouse assembleHouse();
}
