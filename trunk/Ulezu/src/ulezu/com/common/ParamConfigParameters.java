package ulezu.com.common;

import java.io.IOException;
import java.util.Properties;

/**
 *得到paramConfig.properties文件的值
 * @author wei
 *
 */
public class ParamConfigParameters {
	//文件路径
	String configFilePath = "paramConfig.properties";
	Properties properties = null;

	public ParamConfigParameters() {
		properties = new Properties();
		try {
			properties.load(ParamConfigParameters.class.getClassLoader().getResourceAsStream(configFilePath));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getParameter(String key) {
		return properties.getProperty(key);
	}
	
	/**
	 *@author wei
	 *@version 创建时间:2014-3-16下午05:56:33
	 *@param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParamConfigParameters p = new ParamConfigParameters();
		System.out.println(p.getParameter("EMAIL_KEY"));
	}

}
