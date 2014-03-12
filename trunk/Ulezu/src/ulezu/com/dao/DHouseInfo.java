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
		String querySql = "select id,userName,rentWay,estateName,houseTingNum,houseRoomNum,houseToiletNum,layerNum,totleLayerNum,squareMeter" +
				",modifyTime,roomType,sexType,decorationType,estateType,rentMoney,payType,houseTitle,address,addressArea,addressCircle" +
				",addressAttach" +
				" from houseinfo where isDelete=0 limit 1";
		PreparedStatement ps = con.prepareStatement(querySql);
		ResultSet rs = null;
		MHouseInfo info = null;
		rs = ps.executeQuery();
		while(rs.next()) {
			info = new MHouseInfo();
			info.setId(rs.getString(1));
			info.setUserName(rs.getString(2));
			info.setRentWay(rs.getInt(3));
			info.setEestateName(rs.getString(4));
			info.setHouseTingNum(rs.getInt(5));
			info.setHouseRoomNum(rs.getInt(6));
			info.setHouseToiletNum(rs.getInt(7));
			info.setLayerNum(rs.getInt(8));
			info.setTotleLayerNum(rs.getInt(9));
			info.setSquareMeter(rs.getInt(10));
			info.setModifyTime(rs.getDate(11));
			info.setRoomType(rs.getInt(12));
			info.setSexType(rs.getInt(13));
			info.setDecorationType(rs.getInt(14));
			info.setEstateType(rs.getInt(15));
			info.setRentMoney(rs.getInt(16));
			info.setPayType(rs.getInt(17));
			info.setHouseTitle(rs.getString(18));
			info.setAddress(rs.getString(19));
			info.setAddressArea(rs.getString(20));
			info.setAddressCircle(rs.getString(21));
			info.setAddressAttach(rs.getString(22));
		}
		
		return info;
	}

}
