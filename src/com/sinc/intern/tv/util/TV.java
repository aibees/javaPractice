package com.sinc.intern.tv.util;

public interface TV {
	// literal
	// public static final String URL = "https://github.com/aibees";
	
	/*
	 * 어차피 interface class이기 때문에 method에 abstract를 넣을 필요가 없다.
	 * 하지만 일반 클래스에 추상method를 넣고자 한다면 abstract는 필수
	 * */
	
	public void turnOn();
	public void turnOff();
	public void soundUp();
	public void soundDown();
}
