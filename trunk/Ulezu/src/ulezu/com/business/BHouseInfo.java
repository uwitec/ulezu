package ulezu.com.business;

import java.sql.Connection;
import java.sql.SQLException;

import ulezu.com.connection.ConnectionFactory;
import ulezu.com.factory.DaoFactory;
import ulezu.com.idao.IHouseInfo;
import ulezu.com.model.MHouseInfo;

/**
 * 房屋信息业务类
 * @author Administrator
 *
 */
public class BHouseInfo {
	/**
	 * 数据库连接
	 */
	private Connection con;
	
	/**
	 * 房屋信息处理类
	 */
	private IHouseInfo houseInfoHandler;
	
	/**
	 * 构造器
	 */
	public BHouseInfo(){
		this.houseInfoHandler = DaoFactory.getDHouseInfo();
	} 
	
	/**
	 * 根据id获取房屋信息
	 * @param id ID
	 * @return 返回房屋信息
	 * @throws SQLException 抛出异常
	 */
	public MHouseInfo getHouseInfoById(String id) throws Exception {
		try{
			this.con = ConnectionFactory.getUlezuReadConnection();
			return this.houseInfoHandler.getHouseInfoById(id, this.con);
		}finally{
			if(!this.con.isClosed()){
				this.con.close();
			}
		}
	}
	
	/**
	 * 通过ID更新访问量
	 * @param id ID
	 * @return 返回更新的行数
	 * @throws Exception 抛出异常
	 */
	public int updateAccessCountById(String id) throws Exception{
		try{
			this.con = ConnectionFactory.getUlezuWriteConnection();
			String countStr = this.houseInfoHandler.getAccessCountById(id, this.con);
			Integer count = Integer.parseInt("".equals(countStr) == true ? "0" : countStr) + 1;
			return this.houseInfoHandler.updateAccessCountById(id, count.toString(), this.con);
		}finally{
			if(!this.con.isClosed()){
				this.con.close();
			}
		}
	}
}
