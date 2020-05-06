package com.di;

public class AnotherStudent {
	
	private MathCheat mCheat;

	public void setmCheat(MathCheat mCheat) {
		this.mCheat = mCheat;
	}
	
	public void startCheating() {
		mCheat.Cheat();
	}

}
