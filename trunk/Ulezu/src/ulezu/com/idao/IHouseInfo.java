package ulezu.com.idao;

import java.sql.Connection;

import ulezu.com.model.MHoiuseInfo;

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
	 */
	public MHoiuseInfo getHouseInfoById(String id, Connection con);
}
