package ulezu.com.dao;

import java.sql.Connection;

import ulezu.com.idao.IHouseInfo;
import ulezu.com.model.MHoiuseInfo;

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
	 */
	@Override
	public MHoiuseInfo getHouseInfoById(String id, Connection con) {
		// TODO Auto-generated method stub
		return null;
	}

}
