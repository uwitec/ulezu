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
	 * 用户id
	 */
	private String id = "";
	
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
	 * 注册时间
	 */
	private String registeTime;
	
	/**
	 * 删除状态
	 */
	private String isDelete;
	
	private String A1;
	private String A2;
	private String A3;
	private String A4;
	private String A5;
	private String A6;
	private String A7;
	private String A8;
	private String A9;
	private String A10;
	
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
	
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getRegisteTime() {
		return registeTime;
	}

	public void setRegisteTime(String registeTime) {
		this.registeTime = registeTime;
	}

	public String getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}

	public String getA1() {
		return A1;
	}

	public void setA1(String a1) {
		A1 = a1;
	}

	public String getA2() {
		return A2;
	}

	public void setA2(String a2) {
		A2 = a2;
	}

	public String getA3() {
		return A3;
	}

	public void setA3(String a3) {
		A3 = a3;
	}

	public String getA4() {
		return A4;
	}

	public void setA4(String a4) {
		A4 = a4;
	}

	public String getA5() {
		return A5;
	}

	public void setA5(String a5) {
		A5 = a5;
	}

	public String getA6() {
		return A6;
	}

	public void setA6(String a6) {
		A6 = a6;
	}

	public String getA7() {
		return A7;
	}

	public void setA7(String a7) {
		A7 = a7;
	}

	public String getA8() {
		return A8;
	}

	public void setA8(String a8) {
		A8 = a8;
	}

	public String getA9() {
		return A9;
	}

	public void setA9(String a9) {
		A9 = a9;
	}

	public String getA10() {
		return A10;
	}

	public void setA10(String a10) {
		A10 = a10;
	}
}
