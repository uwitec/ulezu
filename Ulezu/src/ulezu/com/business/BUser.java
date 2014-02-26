//*******************************//
//<xml fileName="BUser.java" ?>
//<author>申鱼川</author>
//<dateTime>2014-02-23</dateTime>
//</xml>
//*******************************//
package ulezu.com.business;

import ulezu.com.factory.DaoFactory;
import ulezu.com.idao.IUserDao;
import ulezu.com.model.MUser;
import ulezu.com.util.MD5Encrypt;

/**
 * 用户业务类
 * 
 * @author Administrator
 * 
 */
public class BUser {
	/**
	 * 用户访问接口
	 */
	private IUserDao userDao = null;

	/**
	 * 构造函数
	 */
	public BUser() {
		this.userDao = DaoFactory.getDUserDao();
	}

	/**
	 * 判断用户是否登录
	 * 
	 * @param userName
	 *            用户名
	 * @param password
	 *            用户密码
	 * @return 返回bool值 true登录正确
	 */
	public boolean login(String userName, String password) {
		boolean isSuccess = false;
		isSuccess = this.userDao.login(userName,
				MD5Encrypt.encryptMD5To32(password));
		return isSuccess;
	}

	/**
	 * 用户注册
	 * 
	 * @param MUser
	 *            用户对象
	 * @return 注册影响的行数
	 */
	public int register(MUser user) {
		user.setUserPassword(MD5Encrypt.encryptMD5To32(user.getUserPassword()));
		int rows = 0;
		rows = this.userDao.register(user);
		return rows;
	}
}
