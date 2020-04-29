package com.spring;

public class Student {
	private int id;
	private String studentName;
	
	
	//Setter injection
	public void setId(int id) {
		this.id = id;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void displayStudentInfo() {
		System.out.println("Student name is: "+ studentName+" and Id is: "+id);
		
	}
}
