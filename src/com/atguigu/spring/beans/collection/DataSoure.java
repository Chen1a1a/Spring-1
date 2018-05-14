package com.atguigu.spring.beans.collection;

import java.util.Properties;

public class DataSoure {
	
	private Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "DataSoure [properties=" + properties + "]";
	}
	
	
}
