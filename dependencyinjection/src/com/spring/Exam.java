package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {
		ApplicationContext contex = new ClassPathXmlApplicationContext("beans.xml");
		Student suchi = contex.getBean("student",Student.class);
		suchi.displayStudentInfo();
		
		Student kancha= contex.getBean("student1",Student.class);
		kancha.displayStudentInfo();
	}
}
