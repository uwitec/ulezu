//*******************************//
//<xml fileName="ConnectionHelper.java" ?>
//<author>申鱼川</author>
//<dateTime>2014-02-23</dateTime>
//</xml>
//*******************************//
package ulezu.com.connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 连接helper
 * @author Administrator
 *
 */
public class ConnectionHelper {
	/*
	 * 数据库连接
	 */
	private static Connection conn=null;
	
	/**
	 * 根据库名得到连接
	 * @param databaseName 数据库名称
	 * @return 返回连接对象
	 */
	public static Connection getConnection(String databaseName){
		try {
			ConnectionParameters params = new ConnectionParameters(databaseName);
			Class.forName(params.driverClass);
			conn=DriverManager.getConnection(params.dbUrl, params.dbUsername, params.dbPassword);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}
