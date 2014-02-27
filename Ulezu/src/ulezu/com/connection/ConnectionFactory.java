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
}
