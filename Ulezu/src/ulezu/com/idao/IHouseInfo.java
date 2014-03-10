package ulezu.com.idao;

import java.sql.Connection;
import java.sql.SQLException;

import ulezu.com.model.MHouseInfo;

/**
 * 房屋信息接口
 * @author Administrator
 *
 */
public interface IHouseInfo {
	/**
	 * 根据id获取房屋信息
	 * @param id ID
	 * @param con 数据库连接
	 * @return 返回房屋信息
	 * @throws SQLException 抛出异常
	 */
	public MHouseInfo getHouseInfoById(String id, Connection con)  throws SQLException;
}
