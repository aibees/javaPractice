package com.sinc.intern.tv.factory;

import java.util.HashMap;
import java.util.Map;

import com.sinc.intern.tv.model.vo.LgTV;
import com.sinc.intern.tv.model.vo.SamsungTV;
import com.sinc.intern.tv.util.TV;

public class BeanFactory {
	
	private Map<String, TV> tvBrand = new HashMap<String, TV>();
	
	// create Singleton Instance
	private BeanFactory() {
		createBrand();
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
	
	public void createBrand() {
		tvBrand.put("Samsung", new SamsungTV());
		tvBrand.put("LG", new LgTV());
	}
	
	public TV getBrand(String brand) {
		return tvBrand.get(brand);
	}
}
