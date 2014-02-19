package ulezu.com.common;


import java.util.Properties;

public class DBParameters {
	public static String DBURL;               //鏁版嵁搴揢RL
	public static String DBUSERNAME;    //鏁版嵁搴撳悕绉�
	public static String DBPASSWORD;    //鏁版嵁搴撳瘑鐮�
	/**
	 * 
	 *@Description:闈欐�鍔犺浇鏁版嵁搴撻厤缃枃浠�
	 *@author:鐢抽奔宸�
	 *@return锛歯ull
	 */
	static{
		try {
			Properties properties=new Properties();
			properties.load(DBParameters.class.getClassLoader().getResourceAsStream("mysql.properties"));
			DBURL=(String) properties.get("url");                                                 //鑾峰彇URL 
			DBUSERNAME=(String) properties.get("name");                                 //鑾峰彇NAME
			DBPASSWORD=(String) properties.get("password");                           //鑾峰彇瀵嗙爜
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}