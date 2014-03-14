package ulezu.com.connection;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3p0ConnectionPool {
	private DataSource ds;
	private static C3p0ConnectionPool pool;
	private C3p0ConnectionPool(){
		ds = new ComboPooledDataSource();
	}
	
	public synchronized static final C3p0ConnectionPool getInstance(){
		if(pool==null){
			try{
				pool = new C3p0ConnectionPool();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return pool;
	}
	
	public synchronized final Connection getConnection() {  
		try {
			return ds.getConnection();
		} catch (SQLException e) {     
			e.printStackTrace();
		}
		return null;
	}
	
	
}