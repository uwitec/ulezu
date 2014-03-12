package ulezu.com.model;

import java.util.Date;

/**
 * 图片信息类
 * @author shenyuchuan
 *
 */
public class MImageInfo {
	/**
	 * ID
	 */
	private String id;
	/**
	 * 房屋信息ID
	 */
	private String houseId;
	/**
	 * 图片类型
	 */
	private int imageType;
	/**
	 * 大图片地址
	 */
	private String bigImageUrl;
	/**
	 * 中等图片地址
	 */
	private String middleImageUrl;
	/**
	 * 小图片地址
	 */
	private String smallImageUrl;
	/**
	 * 上传时间
	 */
	private Date uploadTime;
	/**
	 * 上传人
	 */
	private String userName;
	/**
	 * 删除状态
	 */
	private int isDelete;
	/**
	 * 备用字段
	 */
	private String A1;
	/**
	 * 备用字段
	 */
	private String A2;
	/**
	 * 备用字段
	 */
	private String A3;
	
	/**
	 * 上传IP
	 */
	private String uploadIp;
	
	/**
	 * 获取ID
	 * @return ID
	 */
	public String getId(){
		return this.id;
	}
	
	/**
	 * 设置ID
	 * @param id ID
	 */
	public void setId(String id){
		this.id = id;
	}
	
	/**
	 * 获取房屋信息ID
	 * @return 房屋信息ID
	 */
	public String getHouseId(){
		return this.houseId;
	}	
	
	/**
	 * 设置房屋信息ID
	 * @param houseId 房屋信息ID
	 */
	public void setHouseId(String houseId){
		this.houseId = houseId;
	}
	
	/**
	 * 获取图片类型
	 */
	public int getImageType(){
		return this.imageType;
	}
	
	/**
	 * 设置图片类型
	 * @param imageType 图片类型（0:房屋信息 1:用户头像）
	 */
	public void setImageType(int imageType){
		this.imageType =  imageType;
	}
	
	/**
	 * 获取大图片地址
	 */
	public String getBigImageUrl(){
		return this.bigImageUrl;
	}
	
	/**
	 *设置大图片地址
	 */
	public void setBigImageUrl(String bigImageUrl){
		this.bigImageUrl = bigImageUrl;
	}
	
	/**
	 * 获取中等图片地址
	 */
	public String getMiddleImageUrl(){
		return this.middleImageUrl;
	}
	
	/**
	 * 设置中等图片地址
	 */
	public void setMiddleImageUrl(String middleImageUrl){
		this.middleImageUrl = middleImageUrl;
	}
	
	/**
	 * 获取小图片地址
	 */
	public String getSmallImageUrl(){
		return this.smallImageUrl;
	}
	
	/**
	 * 设置小图片地址
	 */
	public void setSmallImageUrl(String smallImageUrl){
		this.smallImageUrl = smallImageUrl;
	}
	
	/**
	 * 获取上传时间
	 */
	public Date getUploadTime(){
		return this.uploadTime;
	}
	
	/**
	 * 设置上传时间
	 */
	public void setUploadTime(Date uploadTime){
		this.uploadTime = uploadTime;
	}
	
	/**
	 * 获取上传人
	 */
	public String getUserName(){
		return this.userName;
	}
	
	/**
	 * 设置上传人
	 */
	public void setUserName(String userName){
		this.userName = userName;
	}
	
	/**
	 * 获取删除状态
	 */
	public int getIsDelete(){
		return this.isDelete;
	}
	
	/**
	 * 设置删除状态
	 * @param isDelete 0-未删除 1-删除
	 */
	public void setIsDelete(int isDelete){
		this.isDelete = isDelete;
	}
	
	/**
	 * 备用字段
	 */
	public String getA1(){
		return this.A1;
	}
	/**
	 * 备用字段
	 */
	public void setA1(String A1){
		this.A1 = A1;
	}
	/**
	 * 备用字段
	 */
	public String getA2(){
		return this.A2;
	}
	
	/**
	 * 备用字段
	 */
	public void setA2(String A2){
		this.A2 = A2;
	}
	
	/**
	 * 备用字段
	 */
	public String getA3(){
		return this.A3;
	}
	
	/**
	 * 备用字段
	 */
	public void setA3(String A3){
		this.A3 = A3;
	}
	
	/**
	 * 上传IP
	 */
	public String getUploadIp(){
		return this.uploadIp;
	}
	/**
	 * 上传IP
	 */
	public void setUploadIp(String uploadIp){
		this.uploadIp = uploadIp;
	}

}
