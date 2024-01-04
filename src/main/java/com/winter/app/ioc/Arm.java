package com.winter.app.ioc;


//추상클래스 선언 (abstract)
// 마음대로 오버라이딩 해라
public abstract class Arm {
	private String direction;
	
	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public abstract void act();
	
}
