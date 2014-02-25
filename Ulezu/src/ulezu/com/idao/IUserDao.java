//*******************************//
//<xml fileName="IUserDao.java" ?>
//<author>申鱼川</author>
//<dateTime>2014-02-23</dateTime>
//</xml>
//*******************************//
package ulezu.com.idao;

import java.sql.Connection;

import ulezu.com.model.MUser;

/**
 * 用户接口
 * @author 申鱼川
 *
 */
public interface IUserDao {
	/**
	 * 判断用户是否登录
	 * @param userName 用户名
	 * @param password 用户密码
	 * @param Connection 连接对象
	 * @return 返回bool值 true登录正确
	 */
	public boolean login(String userName, String password, Connection conn);
	
	/**
	 * 用户注册
	 * @param MUser 用户对象
	 * @param Connection 连接对象
	 * @return 注册影响的行数
	 */
	public int register(MUser user, Connection conn);
}