package ulezu.com.connection;

import java.sql.Connection;

public class ConnectionFactory {
	/**
	 * 获取Ulezu连接
	 * @return Ulezu连接
	 */
	public static Connection getUlezuReadConnection(){
		return ConnectionHelper.getConnection("Ulezu");
	}
}
