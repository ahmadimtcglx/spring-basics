package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[]args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		Student var = context.getBean("student",Student.class);
		var.cheating();
		((AbstractApplicationContext) context).close();
	
	}
}
