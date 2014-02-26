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
	
	/**
	 * 得到秦伟本地数据库连接
	 * @return Ulezu连接
	 *
	 * author 秦伟
	 * time 2014-2-26 上午10:57:47
	 */
//	public static Connection getQinWeiUlezuReadConnection() {
//		return ConnectionHelper.getConnection("QinWeiUlezu");
//	}
}
