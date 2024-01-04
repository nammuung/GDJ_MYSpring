package com.winter.app.ioc;

import org.springframework.beans.factory.annotation.Autowired;

public class Robot {
	// 팔, 왼쪽팔 , 오른쪽팔
	// has a: 멤버 변수 선언  로봇은 팔을 가지고 있다.
//	private LeftArm leftArm;
//	private RightArm rightArm;

	private LeftArm leftArm;
	

	private RightArm rightArm;
	
	
	public LeftArm getLeftArm() {
		return leftArm;
	}
	public void setLeftArm(LeftArm leftArm) {
		this.leftArm = leftArm;
	}

	public RightArm getRightArm() {
		return rightArm;
	}

	public void setRightArm(RightArm rightArm) {
		this.rightArm = rightArm;
	}

	// 1번째 방법 기본 생성자 선언
//	public Robot() {
//		this.leftArm=new LeftArm();
//		this.rightArm=new RightArm();
//	}
	
	// 2번째 방법 매개변수 받음
	public Robot(LeftArm leftArm, RightArm rightArm) {
			this.leftArm=leftArm;
			this.rightArm=rightArm;
	}
	// 3번째 방법 외부에서 받아서 넣음 세터,게터
	
	
	
	// 다리
	
	
}
