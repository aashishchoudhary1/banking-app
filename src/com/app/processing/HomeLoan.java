package com.app.processing;

public class HomeLoan extends Loan {

	 public double getHomeloanrate() {
		return homeloanrate;
	}
	public void setHomeloanrate(double homeloanrate) {
		this.homeloanrate = homeloanrate;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	double homeloanrate;
	 int duration;
}
