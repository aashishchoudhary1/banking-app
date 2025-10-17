package com.app.processing;

import java.util.ArrayList;

public class ConnectionPool {
	
	ConnectionFactory cfactory;
	private int size;
	
	ConnectionPool(int size  ){
		this.size = size;
	}
	
	private ArrayList<MySQLConnection> pool;
	
	private MySQLConnection conn;
	
	public MySQLConnection getConnection() {
		
		if(pool!=null && pool.size()>0) {
			
			conn = pool.get(0);
			pool.remove(0);
		}
		
		return conn;
	}
	
	
	public void intializepool( ) {
		
		
		//bydefault size is 1
		//as per size i need to create object in pool
		pool = new ArrayList<MySQLConnection>();
		pool.add(ConnectionFactory.getInstance().createConnection("mysql"));
	}
	
	public int size() {
		return pool.size();
	}

	public boolean releaseConnection(MySQLConnection con) {
		
		pool.add(con);
		return true;
		
	}
}
