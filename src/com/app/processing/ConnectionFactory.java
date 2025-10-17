package com.app.processing;

public class ConnectionFactory {
	
	
	
	private ConnectionFactory() {
		
	}
	private static ConnectionFactory cfactory;
	
	public static ConnectionFactory getInstance() {
		
		if(null==cfactory) {
			
			cfactory = new ConnectionFactory();
		}
		
		return cfactory;
	}

	public MySQLConnection createConnection(String mysql) {
		
		return new MySQLConnection();
		
	}
}
