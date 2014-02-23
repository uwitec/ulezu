//*******************************//
//<xml fileName="DaoFactory.java" ?>
//<author>申鱼川</author>
//<dateTime>2014-02-23</dateTime>
//</xml>
//*******************************//
package ulezu.com.factory;

import ulezu.com.dao.DUserDao;
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
}
