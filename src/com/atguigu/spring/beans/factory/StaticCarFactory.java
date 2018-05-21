package com.atguigu.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

public class StaticCarFactory {

	public static Map<String, Car> cars = new HashMap<>();
	
	static {
		cars.put("audi", new Car("audi", 300000));
		cars.put("ford", new Car("ford", 400000));
	}
	
	//静态工厂方法
	public static Car getCar(String name) {
		return cars.get(name);
	}
}
