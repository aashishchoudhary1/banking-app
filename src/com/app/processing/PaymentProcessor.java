package com.app.processing;

public interface PaymentProcessor {

    public abstract void processPayment(double amount); 
    
    public abstract void coinbasedPayment(double amount);

}
