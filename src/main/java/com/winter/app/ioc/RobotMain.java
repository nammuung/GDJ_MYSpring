package com.winter.app.ioc;

public class RobotMain {

	
	// 디펜던시 인젝션 (주입)
	public static void main(String[] args) {
		Robot robot = new Robot();
		
		robot.getLeftArm().act();
		
	}

}
