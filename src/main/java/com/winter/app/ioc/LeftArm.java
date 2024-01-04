package com.winter.app.ioc;

import org.springframework.stereotype.Component;

// Arm 상속받음

public class LeftArm extends Arm{

	@Override
	public void act() {
		System.out.println("왼쪽팔 ");
	}
	
}
