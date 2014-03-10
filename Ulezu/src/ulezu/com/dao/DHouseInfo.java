package ulezu.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import ulezu.com.idao.IHouseInfo;
import ulezu.com.model.MHouseInfo;

/**
 * 房屋信息数据库访问类
 * @author Administrator
 *
 */
public class DHouseInfo implements IHouseInfo{
	/**
	 * 根据id获取房屋信息
	 * @param id ID
	 * @param con 数据库连接
	 * @return 返回房屋信息
	 * @throws SQLException  抛出异常
	 */
	@Override
	public MHouseInfo getHouseInfoById(String id, Connection con) throws SQLException {
		String querySql = "select id,userName from houseinfo limit 1";
		PreparedStatement ps = con.prepareStatement(querySql);
		ResultSet rs = null;
		MHouseInfo info = null;
		rs = ps.executeQuery();
		while(rs.next()) {
			info = new MHouseInfo();
			info.setId(rs.getString(1));
			info.setUserName(rs.getString(2));
		}
		
		return info;
	}

}
