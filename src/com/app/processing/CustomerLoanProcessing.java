package com.app.processing;


public class CustomerLoanProcessing {
	
	//there is no dependency on concrete object
	
	//either car loan or home
	private LoanProcessor lprocessor;
	
	
	private ConnectionPool pool;
	
	CustomerLoanProcessing(ConnectionPool pool,LoanProcessor lprocessor){
		this.lprocessor = lprocessor;
		this.pool = pool;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	String loantupe = Scanner().getNext();
		String loantype = "homeloan";
		LoanProcessor loanobj = null;
		ConnectionPool poolobj = new ConnectionPool(20);
		if(loantype!=null && loantype.equals("homeloan"))
		{
			 loanobj = new HomeLoanProcessing();
		}else {
			loanobj = new CarLoanProcessing();
		}
		
		CustomerLoanProcessing obj = new CustomerLoanProcessing(poolobj,loanobj);
		 //if car loan 
		
		HomeLoan hloan = new HomeLoan();
		obj.lprocessor.processLoan(hloan);
		
		obj.pool.intializepool();
		System.out.println("pool size "+obj.pool.size());
		
	
		
		System.out.println("after intialize "+obj.pool.size());
		
		MySQLConnection conn = 	obj.pool.getConnection();
		
		//use connection database operations
		System.out.println("after getting connection "+obj.pool.size());
		obj.pool.releaseConnection(conn);
		
		System.out.println("after release connection "+obj.pool.size());
		
	}

}
