package com.xnky.taotao.command;

public class Test {

	public static void main(String[] args) {
		Light light=new Light();
		Command command=  new OffLigthCommand(light);
		Remote remote=new Remote();
		remote.sendCommand(command);
		 Command onLightCommand = new OnLightCommand(light);
		 remote.sendCommand(onLightCommand);
		 
	}

}
