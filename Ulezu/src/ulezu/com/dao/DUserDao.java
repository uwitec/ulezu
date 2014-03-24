//*******************************//
//<xml fileName="DUserDao.java" ?>
//<author>申鱼川</author>
//<dateTime>2014-02-23</dateTime>
//</xml>
//*******************************//
package ulezu.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ulezu.com.idao.IUserDao;
import ulezu.com.model.MUser;

/**
 * 用户类数据访问类
 * @author Administrator
 *
 */
public class DUserDao implements IUserDao {

	/**
	 * 用户登录
	 *@author qw
	 *@version 创建时间:2014-2-28上午10:37:03
	 * @throws SQLException 
	 *@see ulezu.com.idao.IUserDao#login(ulezu.com.model.MUser, java.sql.Connection)
	 */
	@Override
	public boolean login(MUser user, Connection con) throws SQLException {
		String sql = "select userName from userInfo where userName='"+user.getUserName()+"' or phoneNum='"+user.getPhoneNum()+"' or email='"+user.getEmail()+"' and userPassword='"+user.getUserPassword()+"' limit 1;";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = null;
		rs = ps.executeQuery();
		while(rs.next()) {
			if(!("").equals(rs.getString(1))){
				return true;
			};
			
		}
		
		return false;
	}

	
	/**
	 * 用户注注
	 *@author qw
	 *@version 创建时间:2014-2-28上午10:37:35
	 *@see ulezu.com.idao.IUserDao#register(ulezu.com.model.MUser, java.sql.Connection)
	 */
	@Override
	public int register(MUser user, Connection con) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * 
	 *@author qw
	 *@version 创建时间:2014-3-15上午10:01:48
	 *@see ulezu.com.idao.IUserDao#isAvailableUser(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean isAvailableUser(String email, String password) {
		
		return false;
	}


	/**
	 * 通过邮箱获取用户名
	 * @param email 邮箱
	 * @param con 数据库连接
	 * @return 返回用户名
	 * @throws SQLException 
	 */
	@Override
	public String getUserNameByEmailAccount(String email, Connection con) throws SQLException {
		String sql = "select userName from userInfo where email='"+email+"' limit 1;";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = null;
		rs = ps.executeQuery();
		while(rs.next()) {
			return rs.getString(1);			
		}
		
		return "";
	}

	/**
	 * 通过电话号码获取用户名
	 * @param phoneNum 电话号码
	 * @param con 数据库连接
	 * @return 返回用户名
	 */
	@Override
	public String getUserNameByPhoneNum(String phoneNum, Connection con) throws SQLException  {
		String sql = "select userName from userInfo where phoneNum='"+phoneNum+"' limit 1;";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = null;
		rs = ps.executeQuery();
		while(rs.next()) {
			return rs.getString(1);			
		}
		
		return "";
	}

}
