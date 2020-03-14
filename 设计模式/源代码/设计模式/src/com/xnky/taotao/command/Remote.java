package com.xnky.taotao.command;

public class Remote {
	private  Command command;
	
	public void sendCommand(Command command) {
		this.command=command;
		this.command.execute();
	}
}
