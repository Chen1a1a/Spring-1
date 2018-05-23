package com.atguigu.spring.beans.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.atguigu.spring.beans.annotation.repository.UserRespository;

@Service
public class UserService {
	
	private UserRespository userRespository;
	
	@Autowired
	public void setUserRespository(@Qualifier("userRespositoryImpl")UserRespository userRespository) {
		this.userRespository = userRespository;
	}
	
	public void add() {
		System.out.println("UserService add...");
		userRespository.save();
	}
}
