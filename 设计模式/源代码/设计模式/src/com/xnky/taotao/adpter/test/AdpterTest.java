package com.xnky.taotao.adpter.test;

public class AdpterTest {

	public static void main(String[] args) {
		Robot robot=new Robot();
		
		RobotImitate  robotImitate=new RobotAdpter(new Dog(), new Persion());
		robot.cry(robotImitate);
		robot.run(robotImitate);
	}

}
