package com.xnky.taotao.build.improve;

import com.xnky.taotao.build.Computer;

/**
 * 电脑建造者
 * 
 * @author 孙雪锋
 *
 */
public interface ComputerBuilder {
	public Computer assemble();
	public  void assembleCpu();
	public  void assembleMonitor();
	public  void assembleHouse();
}
