package ulezu.com.business;

import java.sql.Connection;
import java.util.List;

import ulezu.com.connection.ConnectionFactory;
import ulezu.com.factory.DaoFactory;
import ulezu.com.idao.IEmailConfig;
import ulezu.com.model.MEmailConfig;

/**
 * 邮件配置业务层
 * @author Administrator
 *
 */
public class BEmailConfig {
	/**
	 * 邮件配置接口
	 */
	private IEmailConfig configHandler = null;
	
	/**
	 * 连接
	 */
	private Connection con = null;
	
	/**
	 * 构造函数
	 */
	public BEmailConfig(){
		this.configHandler = DaoFactory.getDEmailConfig();
	}
	
	/**
	 * 获取邮件配置集合
	 * @return 邮件配置集合
	 * @throws Exception 抛出异常
	 */
	public List<MEmailConfig> getEmailConfigList() throws Exception {
		try{
			this.con = ConnectionFactory.getUlezuReadConnection();
			return this.configHandler.getEmailConfigList(this.con);
		}finally{
			if(!this.con.isClosed()){
				this.con.close();
			}
		}
	}
	
	/**
	 * 添加邮件配置
	 * @param config 邮件配置
	 * @return 影响的行数
	 * @throws Exception 抛出异常
	 */
	public int addEmailConfig(MEmailConfig config) throws Exception {
		try{
			this.con = ConnectionFactory.getUlezuWriteConnection();
			return this.configHandler.addEmailConfig(config, this.con);
		}finally{
			if(!this.con.isClosed()){
				this.con.close();
			}
		}
	}
}
