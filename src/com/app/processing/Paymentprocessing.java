package com.app.processing;

public class Paymentprocessing implements PaymentProcessor {
	
	

	 @Override
	    public void processPayment(double amount) {
	        System.out.println("Processing credit card payment of $" + amount);
	    }

	@Override
	public void coinbasedPayment(double amount) {
		System.out.println("Procesiing coin based payment");
		
	}
}
