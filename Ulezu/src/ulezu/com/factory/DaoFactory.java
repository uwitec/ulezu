//*******************************//
//<xml fileName="DaoFactory.java" ?>
//<author>申鱼川</author>
//<dateTime>2014-02-23</dateTime>
//</xml>
//*******************************//
package ulezu.com.factory;

import ulezu.com.dao.DEmailConfig;
import ulezu.com.dao.DUserDao;
import ulezu.com.idao.IEmailConfig;
import ulezu.com.idao.IUserDao;

/**
 * Dao工厂
 * @author Administrator
 *
 */
public class DaoFactory {
	/**
	 * 获取用户数据访问实例
	 * @return用户数据访问实例
	 */
	public static IUserDao getDUserDao(){
		return new DUserDao();
	}
	
	/**
	 * 获取邮件配置数据实例
	 * @return 邮件配置数据实例
	 */
	public static IEmailConfig getDEmailConfig(){
		return new DEmailConfig();
	}
}
