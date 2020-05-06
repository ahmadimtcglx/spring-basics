package com.spring;

public class Student {
	private Cheat cheat;
	
	public void setCheat(Cheat Cheat) {
		this.cheat = Cheat;
	}
	
	public void cheating() {
		cheat.cheat();
	}
}
