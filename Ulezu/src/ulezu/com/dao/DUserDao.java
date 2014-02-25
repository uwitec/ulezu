//*******************************//
//<xml fileName="DUserDao.java" ?>
//<author>申鱼川</author>
//<dateTime>2014-02-23</dateTime>
//</xml>
//*******************************//
package ulezu.com.dao;

import java.sql.Connection;

import ulezu.com.idao.IUserDao;
import ulezu.com.model.MUser;

/**
 * 用户类数据访问类
 * @author Administrator
 *
 */
public class DUserDao implements IUserDao {
	/**
	 * 判断用户是否登录
	 * @param userName 用户名
	 * @param password 用户密码
	 * @return 返回bool值 true登录正确
	 */
	@Override
	public boolean login(String userName, String password, Connection con) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * 用户注册
	 * @param MUser 用户对象
	 * @return 注册影响的行数
	 */
	@Override
	public int register(MUser user, Connection con) {
		// TODO Auto-generated method stub
		return 0;
	}

}
