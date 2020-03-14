package com.xnky.taotao.command;

public class OffLigthCommand  implements Command{
	private Light light;

	public OffLigthCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

}
