package ulezu.com.model;

public class MEmailConfig {
	/**
	 * ID
	 */
	private String id;
	
	/**
	 * 发送邮件的服务器的地址
	 */
	private String mailServerHost;
	
	/**
	 * 发送邮件的服务器的端口
	 */
	private String mailServerPort;
	
	/**
	 * 邮箱密码（要加密，需要解密）
	 */
	private String userPassword;
	
	/**
	 * 发送的电子邮箱地址
	 */
	private String email;
	
	/**
	 * 电子邮箱地址用户名
	 */
	private String emailUserName;
	
	/**
	 * 邮件内容
	 */
	private String emailContent;
	
	/**
	 * 邮件标题
	 */
	private String emailTitle;
	
	/**
	 * 是否删除
	 */
	private int isDelete;
	
	/**
	 * 邮件类型
	 */
	private String emailType;
	
	/**
	 * 备用字段A1
	 */
	private String A1;
	
	/**
	 * 备用字段A2
	 */
	private String A2;
	
	/**
	 * 备用字段A3
	 */
	private String A3;
	
	/**
	 * 得到ID
	 */
	public String getId(){
		return this.id;
	};
	
	/**
	 * 得到发送邮件的服务器的地址
	 */
	public String getMailServerHost(){
		return this.mailServerHost;
	};
	
	/**
	 * 得到发送邮件的服务器的端口
	 */
	public String getMailServerPort(){
		return this.mailServerPort;
	};
	
	/**
	 * 得到邮箱密码（要加密，需要解密）
	 */
	public String getUserPassword(){
		return this.userPassword;
	};
	
	/**
	 * 得到发送的电子邮箱地址
	 */
	public String getEmail(){
		return this.email;
	};
	
	/**
	 * 得到电子邮箱地址用户名
	 */
	public String getEmailUserName(){
		return this.emailUserName;
	};
	
	/**
	 * 得到邮件内容
	 */
	public String getEmailContent(){
		return this.emailContent;
	};
	
	/**
	 * 得到邮件标题
	 */
	public String getEmailTitle(){
		return this.emailTitle;
	};
	
	/**
	 * 得到是否删除
	 */
	public int getIsDelete(){
		return this.isDelete;
	};
	
	/**
	 * 得到邮件类型
	 */
	public String getEmailType(){
		return this.emailType;
	};
	
	/**
	 * 得到备用字段A1
	 */
	public String getA1(){
		return this.A1;
	};
	
	/**
	 * 得到备用字段A2
	 */
	public String getA2(){
		return this.A2;
	};
	
	/**
	 * 得到备用字段A3
	 */
	public String getA3(){
		return this.A3;
	};
	
	/**
	 * 设置ID
	 */
	public void setId(String id){
		this.id = id;
	};
	
	/**
	 * 设置发送邮件的服务器的地址
	 */
	public void setMailServerHost(String mailServerHost){
		this.mailServerHost = mailServerHost;
	};
	
	/**
	 * 设置发送邮件的服务器的端口
	 */
	public void setMailServerPort(String mailServerPort){
		this.mailServerPort =mailServerPort;
	};
	
	/**
	 * 设置邮箱密码（要加密，需要解密）
	 */
	public void setUserPassword(String userPassword){
		this.userPassword = userPassword;
	};
	
	/**
	 * 设置发送的电子邮箱地址
	 */
	public void setEmail(String email){
		this.email = email;
	};
	
	/**
	 * 设置电子邮箱地址用户名
	 */
	public void setEmailUserName(String emailUserName){
		this.emailUserName = emailUserName;
	};
	
	/**
	 * 设置邮件内容
	 */
	public void setEmailContent(String emailContent){
		this.emailContent = emailContent;
	};
	
	/**
	 * 设置邮件标题
	 */
	public void setEmailTitle(String emailTitle){
		this.emailTitle = emailTitle;
	};
	
	/**
	 * 设置是否删除
	 */
	public void setIsDelete(int isDelete){
		this.isDelete = isDelete;
	};
	
	/**
	 * 设置邮件类型
	 */
	public void setEmailType(String emailType){
		this.emailType = emailType;
	};
	
	/**
	 * 设置备用字段A1
	 */
	public void setA1(String A1){
		this.A1 = A1;
	};
	
	/**
	 * 设置备用字段A2
	 */
	public void setA2(String A2){
		this.A2 = A2;
	};
	
	/**
	 * 设置备用字段A3
	 */
	public void setA3(String A3){
		this.A3 = A3;
	};

}
