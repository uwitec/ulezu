package ulezu.com.caches;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import ulezu.com.business.BEmailConfig;
import ulezu.com.connection.ConnectionParameters;
import ulezu.com.util.DateUtil;

/**
 * 邮件配置缓存
 * @author shenyuchuan
 *
 */
public class EmailConfigCache {
	/**
	 * 缓存时间
	 */
	private static int intenalMinutes = 0;
	
	/**
	 * 缓存对象
	 */
	private static Object obj = null;
	
	/**
	 * 最后一次更新时间
	 */
	private static Date lastTime = null;
	
	/**
	 * 设置缓存
	 * @param obj 缓存内容
	 */
	private static void setCache(Object object){
		obj = object;
		lastTime = new Date();
	}
	
	/**
	 * 获取缓存（邮件配置信息）
	 * @return 缓存
	 * @throws Exception 抛出异常
	 */
	private static Object getCache() throws Exception{
		int minutes = (int)DateUtil.getDateDiffMinutes(lastTime.toString(), new Date().toString());
		intenalMinutes = getCacheTime();
		if(obj == null || minutes > intenalMinutes){
			////异步重新获取缓存
			BEmailConfig configBusi = new BEmailConfig();
			setCache(configBusi.getEmailConfigList());
		}
		
		return obj;
	}

	/**
	 * 获取缓存时间
	 * @return 缓存时间
	 */ 
	private static int getCacheTime(){
		Properties properties=new Properties();
		try {
			properties.load(ConnectionParameters.class.getClassLoader().getResourceAsStream("cacheTime.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String time =(String) properties.get("time"); 
		
		return Integer.parseInt(time);
	}
}
