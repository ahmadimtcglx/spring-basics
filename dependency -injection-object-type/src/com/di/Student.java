package com.di;

public class Student {
	
	private int id;
	private MathCheat mathcheat;
	
	
	public void setId(int id) {
		this.id = id;
	}

	public void setMathCheat(MathCheat mathcheat) {
		this.mathcheat = mathcheat;
	}

	public void cheating() {
		mathcheat.Cheat();
		System.out.println("my id is: "+id);
	}
}
