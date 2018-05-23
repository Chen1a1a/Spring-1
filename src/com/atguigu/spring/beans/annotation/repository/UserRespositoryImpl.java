package com.atguigu.spring.beans.annotation.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.atguigu.spring.beans.annotation.TestObject;

@Repository
public class UserRespositoryImpl implements UserRespository {
	
	@Autowired(required=false)
	private TestObject testObject;
	
	@Override
	public void save() {
		System.out.println("UserRespository Save...");
		System.out.println(testObject);

	}

}
