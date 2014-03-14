package ulezu.com.connection;

import java.sql.Connection;

public class ConnectionFactory {
	/**
	 * 获取Ulezu读连接
	 * @return Ulezu连接
	 */
	public static Connection getUlezuReadConnection(){
		return ConnectionHelper.getConnection("ulezu");
	}
	
	/**
	 * 获取Ulezu写连接
	 * @return Ulezu连接
	 */
	public static Connection getUlezuWriteConnection(){
		return ConnectionHelper.getConnection("ulezu");
	}
	
	/**
	 * 得c3p0连接池中的连接
	 *@author qw
	 *@version 创建时间:2014-3-14上午10:41:42
	 *@return 连接池中的连接对象
	 */
	public static Connection getC3p0Connection() {
		return C3p0ConnectionPool.getInstance().getConnection();
	}
}
