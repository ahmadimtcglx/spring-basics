package com.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	public static void main (String[] args) {
		ApplicationContext contex = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config loaded");
		Airtel air = contex.getBean("airtel",Airtel.class);
		air.calling();
		air.data();
	}

}
