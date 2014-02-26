//*******************************//
//<xml fileName="MUser.java" ?>
//<author>申鱼川</author>
//<dateTime>2014-02-23</dateTime>
//</xml>
//*******************************//
package ulezu.com.model;

/*
 * 用户类
 */
public class MUser {
	/*
	 * 用户名
	 */
	private String userName = "";
	
	/*
	 * 电话号码
	 */
	private String phoneNum = "";
	
	/**
	 * 用户登录密码（MD5）
	 */
	private String userPassword = "";
	
	/*
	 * 用户邮箱
	 */
	private String email = "";
	
	/**
	 * 用户性别
	 */
	private String sex = "";
	
	/**
	 * 最后访问时间
	 */
	private String lastVisit;
	
	/**
	 * 设置用户名
	 * @param userName  用户名
	 */
	public void setUserName(String userName){
		this.userName = userName;
	}
	
	/**
	 * 设置电话号码
	 * @param phoneNum  电话号码
	 */
	public void setPhoneNum(String phoneNum){
		this.phoneNum = phoneNum;
	}
	
	/**
	 * 设置用户登录密码（MD5）
	 * @param userPassword 用户登录密码
	 */
	public void setUserPassword(String userPassword){
		this.userPassword = userPassword;
	}
	
	/**
	 * 设置用户邮箱
	 * @param email  邮箱
	 */
	public void setEmail(String email){
		this.email = email;
	}
	
	/**
	 * 设置用户性别
	 * @param sex 性别
	 */
	public void setSex(String sex){
		this.sex = sex;
	}
	
	/**
	 * 得到用户名
	 * @return  用户名
	 */
	public String getUserName(){
		return this.userName;
	}
	
	/**
	 * 得到电话号码
	 * @return  电话号码
	 */
	public String getPhoneNum(){
		return this.phoneNum;
	}
	
	/**
	 * 得到用户密码
	 * @return  用户密码
	 */
	public String getUserPassword(){
		return this.userPassword;
	}
	
	/**
	 * 得到邮箱
	 * @return 邮箱
	 */ 
	public String getEmail(){
		return this.email;
	}
	
	/**
	 * 得到用户性别
	 * @return  性别
	 */
	public String getSex(){
		return this.sex;
	}

	public String getLastVisit() {
		return lastVisit;
	}

	public void setLastVisit(String lastVisit) {
		this.lastVisit = lastVisit;
	}
}
