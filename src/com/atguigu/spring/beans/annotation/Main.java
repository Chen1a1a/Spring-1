package com.atguigu.spring.beans.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.spring.beans.annotation.controller.UserController;
import com.atguigu.spring.beans.annotation.repository.UserRespository;
import com.atguigu.spring.beans.annotation.service.UserService;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-annotation.xml");
		
//		TestObject to = (TestObject) ctx.getBean("testObject");
//		System.out.println(to);
//		
		UserController userController = (UserController) ctx.getBean("userController");
		System.out.println(userController);
		userController.execute();
//		
//		UserService userService = (UserService) ctx.getBean("userService");
//		System.out.println(userService);
//		
//		UserRespository userRespository = (UserRespository) ctx.getBean("userRespository");
//		System.out.println(userRespository);

	}

}
