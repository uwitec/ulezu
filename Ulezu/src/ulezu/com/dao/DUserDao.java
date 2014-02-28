//*******************************//
//<xml fileName="DUserDao.java" ?>
//<author>申鱼川</author>
//<dateTime>2014-02-23</dateTime>
//</xml>
//*******************************//
package ulezu.com.dao;

import java.sql.Connection;

import ulezu.com.common.BaseDao;
import ulezu.com.idao.IUserDao;
import ulezu.com.model.MUser;

/**
 * 用户类数据访问类
 * @author Administrator
 *
 */
public class DUserDao extends BaseDao<MUser> implements IUserDao {

	/**
	 * 用户登录
	 *@author qw
	 *@version 创建时间:2014-2-28上午10:37:03
	 *@see ulezu.com.idao.IUserDao#login(ulezu.com.model.MUser, java.sql.Connection)
	 */
	@Override
	public boolean login(MUser user, Connection con) {
		// TODO Auto-generated method stub
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

}
