package com.sinc.intern.tv.factory;

import com.sinc.intern.tv.model.vo.LgTV;
import com.sinc.intern.tv.model.vo.SamsungTV;
import com.sinc.intern.tv.util.TV;

public class BeanFactory {
	
	private TV[] tvArray;
	
	// create Singleton Instance
	private BeanFactory() {
		tvArray = new TV[2];
		tvArray[0] = new SamsungTV();
		tvArray[1] = new LgTV();
	}
	private static BeanFactory Instance = null;
	public static BeanFactory getInstance() {
		if(Instance == null) {
			return new BeanFactory();
		}
		else {
			return Instance;
		}
	}
	
	// Factory Pattern
	
	
	public TV getBrand(String brand) {
		switch(brand) {
		case "Samsung" :
			return tvArray[0];
		
		case "LG" :
			return tvArray[1];
		default :
			return null;
		}
		
			
	}
}
