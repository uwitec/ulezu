//*******************************//
//<xml fileName="BUser.java" ?>
//<author>申鱼川</author>
//<dateTime>2014-02-23</dateTime>
//</xml>
//*******************************//
package ulezu.com.business;


import java.sql.Connection;
import java.sql.SQLException;

import ulezu.com.factory.DaoFactory;
import ulezu.com.idao.IUserDao;
import ulezu.com.model.MUser;
import ulezu.com.common.MD5Encrypt;
import ulezu.com.connection.ConnectionFactory;

/**
 * 用户业务类
 * 
 * @author Administrator
 * 
 */
public class BUser {
	/**
	 * 数据库连接
	 */
	private Connection con = null;
	
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
	 * @throws Exception 抛出异常
	 */
	public boolean login(MUser user) throws Exception {
		try{
			this.con = ConnectionFactory.getUlezuReadConnection();
			return this.userDao.login(user, this.con);
		}finally{
			if(!this.con.isClosed()){
				this.con.close();
			}
		}
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
	
	public boolean isAvailableUser(String email, String password) {
		return this.userDao.isAvailableUser(email, MD5Encrypt.encryptMD5To32(password));
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
	
	/**
	 * 通过邮箱获取用户名
	 * @param email 邮箱
	 * @param con 数据库连接
	 * @return 返回用户名
	 * @throws Exception 抛出异常
	 */
	public String getUserNameByEmailAccount(String email) throws Exception {
		try{
			this.con = ConnectionFactory.getUlezuReadConnection();
			return this.userDao.getUserNameByEmailAccount(email, this.con);
		}finally{
			if(!this.con.isClosed()){
				this.con.close();
			}
		}
	}

	/**
	 * 通过电话号码获取用户名
	 * @param phoneNum 电话号码
	 * @param con 数据库连接
	 * @return 返回用户名
	 * @throws Exception  抛出异常
	 */
	public String getUserNameByPhoneNum(String phoneNum) throws Exception {
		try{
			this.con = ConnectionFactory.getUlezuReadConnection();
			return this.userDao.getUserNameByPhoneNum(phoneNum, this.con);
		}finally{
			if(!this.con.isClosed()){
				this.con.close();
			}
		}
	}
}
