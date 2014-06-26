package ulezu.com.connection;


import java.io.IOException;
import java.util.Properties;

public class ConnectionParameters {
	/**
	 * 数据库url
	 */
	public String dbUrl;
	
	/**
	 * 数据库用户名
	 */
	public String dbUsername;
	
	/**
	 * 数据库密码
	 */
	public String dbPassword;
	
	/**
	 * 驱动名
	 */
	public String driverClass;
	
	/**
	 * 属性对象
	 */
	private Properties properties = null;
	
	
	/**
	 * 构造方法
	 * @param databaseName 数据库名
	 */
	public ConnectionParameters(String databaseName){
		properties=new Properties();
		try {
			properties.load(ConnectionParameters.class.getClassLoader().getResourceAsStream("mysql.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		dbUrl=(String) properties.get(databaseName + "url");                                                 //获取URL 
		dbUsername=(String) properties.get(databaseName + "name");                                 //获取NAME
		dbPassword=(String) properties.get(databaseName + "password");                           //获取密码
		driverClass=(String) properties.get(databaseName + "driverClass");
	}  
}