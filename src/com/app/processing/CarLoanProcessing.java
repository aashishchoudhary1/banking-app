package com.app.processing;

public class CarLoanProcessing implements LoanProcessor {

public boolean processLoan(Loan lp) {
		
		System.out.println(" car loan processed ");
		return true;
	}
}
