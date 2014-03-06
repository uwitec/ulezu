package ulezu.com.dao;

import java.util.List;

import ulezu.com.idao.IEmailConfig;
import ulezu.com.model.MEmailConfig;

/**
 * 邮件配置数据访问
 * @author Administrator
 *
 */
public class DEmailConfig implements IEmailConfig{
	/**
	 * 获取邮件配置集合
	 * @return 邮件配置集合
	 */
	@Override
	public List<MEmailConfig> getEmailConfigList() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 添加邮件配置
	 * @return 返回添加的行数
	 */
	@Override
	public int addEmailConfig() {
		// TODO Auto-generated method stub
		return 0;
	}

}
