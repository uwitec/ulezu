package ulezu.com.idao;

import java.util.List;

import ulezu.com.model.MEmailConfig;

/**
 * 邮件配置接口
 * @author Administrator
 *
 */
public interface IEmailConfig {
	/**
	 * 获取邮件配置集合
	 * @return 邮件配置集合
	 */
	public List<MEmailConfig> getEmailConfigList();
	
	/**
	 * 添加邮件配置
	 * @return 返回添加的行数
	 */
	public int addEmailConfig();
}
