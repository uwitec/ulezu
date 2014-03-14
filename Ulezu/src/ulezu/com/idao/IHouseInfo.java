package ulezu.com.idao;

import java.sql.Connection;
import java.util.List;

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
	 * @throws Exception 抛出异常
	 */
	public MHouseInfo getHouseInfoById(String id, Connection con)  throws Exception;
	
	/**
	 * 更新数据访问量
	 * @param id 房屋信息ID
	 * @param 访问总量
	 * @param con 数据库连接
	 * @return 影响的行数
	 * @throws Exception 抛出异常
	 */
	public int updateAccessCountById (String id, String count, Connection con)  throws Exception;
	
	/**
	 * 获取数据访问量
	 * @param id 房屋信息ID
	 * @param con 数据库连接
	 * @return 数据访问量
	 * @throws Exception 抛出异常
	 */
	public String getAccessCountById (String id, Connection con)  throws Exception;
	
	/**
	 * 首页搜索
	 * @param condition 搜索条件 
	 * @param type 搜索条件（0-商圈，1-学校，2-医院，3-小区，4-景点，5位置）
	 * @param con 数据库连接
	 * @return 返回搜索信息列表
	 * @throws Exception 抛出异常
	 */
	public List<MHouseInfo> homeQuery(String condition, int type, Connection con)  throws Exception;
}
