package com.atguigu.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.spring.beans.collection.NewPerson;

public class Main {
	
	public static void main(String[] args) {
		/*����spring���
		//����HelloWorld��һ������
		HelloWorld helloWorld = new HelloWorld();
		//Ϊname���Ը�ֵ
		helloWorld.setName("atguigu");
		*/
		
		//1������Spring��IOC��������
		//ApplicationContext ����IOC����
		//ClassPathXmlApplicationContext: ��ApplicationContext�ӿڵ�ʵ���࣬��ʵ�������·���������������ļ�
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2����IOC �����л�ȡBeanʵ��
		//����id��λ��IOC�����е�bean
		//HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
		//�������ͷ���IOC�����е�Bean����Ҫ��IOC�����б���ֻ����һ�������͵�Bean
		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		
		//3������hello����
		//helloWorld.hello();
		
		Car car = (Car) ctx.getBean("car");
		System.out.println(car);
		
		car = (Car) ctx.getBean("car2");
		System.out.println(car);
		
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
	}
}
