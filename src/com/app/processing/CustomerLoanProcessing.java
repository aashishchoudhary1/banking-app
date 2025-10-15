package com.app.processing;

public class CustomerLoanProcessing {
	
	//there is no dependency on concrete object 
	private LoanProcessor lprocessor;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CustomerLoanProcessing obj = new CustomerLoanProcessing();
		 //if car loan 
		obj.lprocessor = new CarLoanProcessing();
		
		
		
		//if home loan
		
		obj.lprocessor = new HomeLoanProcessing();
		HomeLoan loanobj = new HomeLoan();
		obj.lprocessor.processLoan(loanobj);
	}

}
