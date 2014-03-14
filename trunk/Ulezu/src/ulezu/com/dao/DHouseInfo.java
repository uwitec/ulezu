package ulezu.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;


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
	public MHouseInfo getHouseInfoById(String id, Connection con) throws Exception {
		String querySql = "select id,userName,rentWay,estateName,houseTingNum,houseRoomNum,houseToiletNum,layerNum,totleLayerNum,squareMeter" +
				",modifyTime,roomType,sexType,decorationType,estateType,rentMoney,payType,houseTitle,address,addressArea,addressCircle" +
				",addressAttach,a1" +
				" from houseinfo where isDelete=0 and id=" + id + " limit 1";
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
			info.setA1(rs.getString(23));
		}
		
		return info;
	}

	/**
	 * 更新数据访问量
	 * @param id 房屋信息ID
	 * @param 访问总量
	 * @param con 数据库连接
	 * @return 影响的行数
	 * @throws Exception 抛出异常
	 */
	@Override
	public int updateAccessCountById(String id, String count, Connection con)
			throws Exception {
		String upadteSql = "update houseInfo set a1='" + count + "' where id='" + id + "' limit 1";
		PreparedStatement ps = con.prepareStatement(upadteSql);
		return ps.executeUpdate();
	}

	/**
	 * 获取数据访问量
	 * @param id 房屋信息ID
	 * @param con 数据库连接
	 * @return 数据访问量
	 * @throws Exception 抛出异常
	 */
	@Override
	public String getAccessCountById(String id, Connection con)
			throws Exception {
		String querySql = "select a1 from houseInfo where id='" + id + "' limit 1";
		PreparedStatement ps = con.prepareStatement(querySql);
		ResultSet rs = ps.executeQuery();
		String count = "";
		while(rs.next()) {
			count = rs.getString(1);
			break;
		}
		
		return count;
	}
	
	/**
	 * 首页搜索
	 * @param condition 搜索条件 
	 * @param type 搜索条件（0-商圈，1-学校，2-医院，3-小区，4-景点，5位置）
	 * @param con 数据库连接
	 * @return 返回搜索信息列表
	 * @throws Exception 抛出异常
	 */
	@Override
	public List<MHouseInfo> homeQuery(String condition, int type, Connection con) throws Exception {
		String sqlCondition = "";
		switch(type){
			case 0:
				sqlCondition = "addressCircle";
				break;
			case 1:
				sqlCondition = "addressAttach";
				break;
			case 2:
				sqlCondition = "addressAttach";
				break;
			case 3:
				sqlCondition = "address";
				break;
			case 4:
				sqlCondition = "address";
				break;
			case 5:
				sqlCondition = "address";
				break;
			default:
				sqlCondition = "address";
				break;
		}
		String querySql = "select id,userName,rentWay,estateName,houseTingNum,houseRoomNum,houseToiletNum,layerNum,totleLayerNum,squareMeter" +
		",modifyTime,roomType,sexType,decorationType,estateType,rentMoney,payType,houseTitle,address,addressArea,addressCircle" +
		",addressAttach,a1" +
		" from houseinfo where isDelete=0 and " + sqlCondition + " like %" + condition + "% limit 1";
		PreparedStatement ps = con.prepareStatement(querySql);
		ResultSet rs = null;
		MHouseInfo info = null;
		rs = ps.executeQuery();
		List<MHouseInfo> infoList = null;
		if(rs != null){
			infoList = new LinkedList<MHouseInfo>();
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
				info.setA1(rs.getString(23));
				infoList.add(info);
			}
		}
				
		return infoList;
	}

}
