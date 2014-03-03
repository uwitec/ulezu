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
import ulezu.com.common.MD5Encrypt;

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
	 * @param user
	 * @return 返回bool值 true登录正确
	 */
	public boolean login(MUser user) {
		boolean isSuccess = false;
		isSuccess = this.userDao.login(user, null);
		return isSuccess;
	}

	/**
	 * 用户注册
	 * @param user 
	 * 
	 * @param MUser
	 *            用户对象
	 * @return 注册影响的行数
	 */
	public int register(MUser user) {
		user.setUserPassword(MD5Encrypt.encryptMD5To32(user.getUserPassword()));
		int rows = 0;
		rows = this.userDao.register(user, null);
		return rows;
	}
	
	/**
	 * 发送验证邮件
	 *@author qw
	 *@version 创建时间:2014-2-28上午10:33:38
	 *@param email email地址
	 *@return 发送成功返回true
	 */
	public boolean sendActivateEmail(String email) {
		//AESEncryptAndDecrypt.encrypt(email);
		return true;
	}
}
