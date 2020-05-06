package com.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	private Heart heart;
	
	public Human() {
		
	}
	
	
	public Human(Heart heart) {
		System.out.println("calliing the constructor with heart as the argument.");
		this.heart = heart;
	}

	@Autowired
	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("Calling the setter method.");
	}


	public void startPumping() {
		
		if (heart != null) {
		heart.pump();
		}
		else
			System.out.println("You are dead!!");
	}
}
