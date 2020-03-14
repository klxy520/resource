package com.xnky.taotao.command;

public class OnLightCommand implements Command{

	private Light light;
	public OnLightCommand(Light light) {
		super();
		this.light = light;
	}
	@Override
	public void execute() {
		light.on();
	}


}
