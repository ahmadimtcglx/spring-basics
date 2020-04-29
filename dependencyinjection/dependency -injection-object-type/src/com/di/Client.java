package com.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[]args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		Student var = context.getBean("st",Student.class);
		var.cheating();
		
		AnotherStudent as = context.getBean("anotherStudent",AnotherStudent.class);
		as.startCheating();
	}
}
