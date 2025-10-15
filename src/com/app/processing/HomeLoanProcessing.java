package com.app.processing;

public class HomeLoanProcessing implements LoanProcessor {

	
	public boolean processLoan(Loan lp) {
		
		System.out.println(" home loan processed ");
		return true;
	}
}
