package com.sinc.intern.tv.model.vo;

import com.sinc.intern.tv.util.TV;

//public abstract class SamsungTV implements TV {
//	public SamsungTV() {}
//
//}

/*
 * SamsungTV class를 abstract class로 만들어 Override 없이 interface를 받을 수 있다.
 * 다만, abstract class로 만들면 SamsungTV class는 인스턴스를 생서할 수 없고 다른 하위 클래스에 상속시켜야 한다.
 * */


public class SamsungTV implements TV {

	@Override
	public void turnOn() {
		System.out.println("STV turn on");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void soundUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void soundDown() {
		// TODO Auto-generated method stub
		
	}
	
}
