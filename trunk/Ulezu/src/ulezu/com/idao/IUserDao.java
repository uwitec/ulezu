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
	public boolean login(MUser user, Connection con);
	
	/**
	 * 用户注册
	 * @param MUser 用户对象
	 * @param Connection 连接对象
	 * @return 注册影响的行数
	 */
	public int register(MUser user, Connection con);

	public boolean isAvailableUser(String email, String password);
	
	/**
	 * 通过邮箱获取用户名
	 * @param email 邮箱
	 * @param con 数据库连接
	 * @return 返回用户名
	 */
	public String getUserNameByEmailAccount(String email, Connection con);
	
	/**
	 * 
	 * @param email
	 * @param con
	 * @return
	 */
	public String getUserNameByPhoneNum(String phoneNum, Connection con);
}
