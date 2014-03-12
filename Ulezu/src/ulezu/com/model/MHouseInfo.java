package ulezu.com.model;

import java.util.Date;

/**
 * 房屋信息类
 * @author Administrator
 *
 */
public class MHouseInfo {
	/**
	 * 信息ID
	 */
	private String id;
	private String userName;
	private int rentWay;
	private String estateName;
	private int houseTingNum;
	private int houseRoomNum;
	private int houseToiletNum;
	private int layerNum;
	private int totleLayerNum;
	private int squareMeter;
	private int isHome;
	private Date modifyTime;
	private int isDelete;
	private int roomType;
	private int sexType;
	private int houseDirection;
	private int decorationType;
	private int estateType;
	private int rentMoney;
	private int payType;
	private String houseDescrible;
	private String imageId;
	private String linkMan;
	private String linkCallNumber;
	private int isValid;
	/**
	 * 房屋标题
	 */
	private String houseTitle;
	/**
	 * 地址
	 */
	private String	address;
	/**
	 * 位置（区域)
	 */
	private String addressArea;
	/**
	 * 位置（商圈
	 */
	private String addressCircle;

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
	private String A11;
	private String A12;
	private String A13;
	private String A14;
	private String A15;
	private String A16;
	private String A17;
	private String A18;
	private String A19;
	private String A20;
	private String A21;
	private String A22;
	private String A23;
	private String A24;
	private String A25;
	private String A26;
	private String A27;
	private String A28;
	private String A29;
	private String A30;
	
	/**
	 * 信息ID
	 * @return 信息ID
	 */
	public String getId(){
		return this.id;
	}
	
	/**
	 * 获取用户名(发布人)
	 * @return 用户名(发布人)
	 */
	public String getUserName(){
		return this.userName;
	}
	
	/**
	 * 获取
	 * @return
	 */
	public int getRentWay(){
		return this.rentWay;
	}
	
	/**
	 * 获取小区名称
	 * @return 小区名称
	 */
	public String getEestateName(){
		return this.estateName;
	}
	
	/**
	 * 获取房屋户型（厅）数量
	 * @return 房屋户型（厅）数量
	 */
	public int getHouseTingNum(){
		return this.houseTingNum;
	}
	
	/**
	 * 获取房屋户型（室）数量
	 * @return 房屋户型（室）数量
	 */
	public int getHouseRoomNum(){
		return this.houseRoomNum;
	}
	
	/**
	 * 获取房屋户型（卫生间）数量
	 * @return 房屋户型（卫生间）数量
	 */
	public int getHouseToiletNum(){
		return this.houseToiletNum;
	}
	
	/**
	 * 获取楼层数
	 * @return 楼层数
	 */
	public int getLayerNum(){
		return this.layerNum;
	}
	
	/**
	 * 获取楼层总数
	 * @return 楼层总数
	 */
	public int getTotleLayerNum(){
		return this.totleLayerNum;
	}
	
	/**
	 * 获取平方米
	 * @return 平方米
	 */
	public int getSquareMeter(){
		return this.squareMeter;
	}
	
	/**
	 * 获取是否在首页
	 * @return 是否在首页
	 */
	public int getIsHome(){
		return this.isHome;
	}
	
	/**
	 * 获取修改时间
	 * @return 修改时间
	 */
	public Date getModifyTime(){
		return this.modifyTime;
	}
	
	/**
	 * 获取 删除状态
	 * @return 删除状态
	 */
	public int getIsDelete(){
		return this.isDelete;
	}
	
	/**
	 * 获取卧室类型
	 * @return 卧室类型
	 */
	public int getRoomType(){
		return this.roomType;
	}
	
	/**
	 * 获取 性别要求
	 * @return 性别要求
	 */
	public int getSexType(){
		return this.sexType;
	}
	
	/**
	 * 获取 房屋朝向
	 * @return 房屋朝向
	 */
	public int getHouseDirection(){
		return this.houseDirection;
	}
	
	/**
	 * 获取装修情况
	 * @return 装修情况
	 */
	public int getDecorationType(){
		return this.decorationType;
	}
	
	/**
	 * 获取小区类型
	 * @return 小区类型
	 */
	public int getEstateType(){
		return this.estateType;
	}
	
	/**
	 * 获取租金
	 * @return 租金
	 */
	public int getRentMoney(){
		return this.rentMoney;
	}
	
	/**
	 * 获取付款方式
	 * @return 付款方式
	 */
	public int getPayType(){
		return this.payType;
	}
	
	/**
	 * 获取房屋描述
	 * @return 房屋描述
	 */
	public String getHouseDescrible(){
		return this.houseDescrible;
	}
	
	/**
	 * 获取图片ID
	 * @return 图片ID
	 */
	public String getImageId(){
		return this.imageId;
	}
	
	/**
	 * 获取联系人
	 * @return 联系人
	 */
	public String getLinkMan(){
		return this.linkMan;
	}
	
	/**
	 * 获取联系电话
	 * @return 联系电话
	 */
	public String getLinkCallNumber(){
		return this.linkCallNumber;
	}
	
	/**
	 * 获取审核是否通过
	 * @return 审核是否通过
	 */
	public int getIsValid(){
		return this.isValid;
	}
	
	/**
	 * 获取A1
	 * @return A1
	 */
	public String getA1(){
		return this.A1;
	}
	
	/**
	 * 获取A2
	 * @return A2
	 */
	public String getA2(){
		return this.A2;
	}
	
	/**
	 * 获取A3
	 * @return A3
	 */
	public String getA3(){
		return this.A3;
	}
	
	/**
	 * 获取A4
	 * @return A4
	 */
	public String getA4(){
		return this.A4;
	}
	
	/**
	 * 获取A5
	 * @return A5
	 */
	public String getA5(){
		return this.A5;
	}
	
	/**
	 * 获取A6
	 * @return A6
	 */
	public String getA6(){
		return this.A6;
	}
	
	/**
	 * 获取A7
	 * @return A7
	 */
	public String getA7(){
		return this.A7;
	}
	
	/**
	 * 获取A8
	 * @return A8
	 */
	public String getA8(){
		return this.A8;
	}
	
	/**
	 * 获取A9
	 * @return A9
	 */
	public String getA9(){
		return this.A9;
	}
	
	/**
	 * 获取A10
	 * @return A10
	 */
	public String getA10(){
		return this.A10;
	}
	
	/**
	 * 获取A11
	 * @return A11
	 */
	public String getA11(){
		return this.A11;
	}
	
	/**
	 * 获取A12
	 * @return A12
	 */
	public String getA12(){
		return this.A12;
	}
	
	/**
	 * 获取A13
	 * @return A13
	 */
	public String getA13(){
		return this.A13;
	}
	
	/**
	 * 获取A14
	 * @return A14
	 */
	public String getA14(){
		return this.A14;
	}
	
	/**
	 * 获取A15
	 * @return A15
	 */
	public String getA15(){
		return this.A15;
	}
	
	/**
	 * 获取A16
	 * @return A16
	 */
	public String getA16(){
		return this.A16;
	}
	
	/**
	 * 获取 A17
	 * @return A17
	 */
	public String getA17(){
		return this.A17;
	}
	
	/**
	 * 获取A18
	 * @return A18
	 */
	public String getA18(){
		return this.A18;
	}
	
	/**
	 * 获取A19
	 * @return A19
	 */
	public String getA19(){
		return this.A19;
	}
	
	/**
	 * 获取A20
	 * @return A20
	 */
	public String getA20(){
		return this.A20;
	}
	
	/**
	 * 获取A21
	 * @return A21
	 */
	public String getA21(){
		return this.A21;
	}
	
	/**
	 * 获取A22
	 * @return A22
	 */
	public String getA22(){
		return this.A22;
	}
	
	/**
	 * 获取A23
	 * @return A23
	 */
	public String getA23(){
		return this.A23;
	}
	
	/**
	 * 获取A24
	 * @return A24
	 */
	public String getA24(){
		return this.A24;
	}
	
	/**
	 * 获取A25
	 * @return A25
	 */
	public String getA25(){
		return this.A25;
	}
	
	/**
	 * 获取A26
	 * @return A26
	 */
	public String getA26(){
		return this.A26;
	}
	
	/**
	 * 获取A27
	 * @return A27
	 */
	public String getA27(){
		return this.A27;
	}
	
	/**
	 * 获取A28
	 * @return A28
	 */
	public String getA28(){
		return this.A28;
	}
	
	/**
	 * 获取A29
	 * @return A29
	 */
	public String getA29(){
		return this.A29;
	}
	
	/**
	 * 获取A30
	 * @return A30
	 */
	public String getA30(){
		return this.A30;
	}
	
	/**
	 * 获取房屋标题
	 * @return房屋标题
	 */
	public String getHouseTitle(){
		return this.houseTitle;
	}
	
	/**
	 * 获取地址
	 */
	public String	getAddress(){
		return this.address;
	}
	/**
	 * 获取位置（区域)
	 */
	public String getAddressArea(){
		return this.addressArea;
	}
	/**
	 * 获取位置（商圈)
	 */
	public String getAddressCircle(){
		return this.addressCircle;
	}
	
	/**
	 * 设置信息ID
	 */
	public void setId(String id){
		this.id = id;
	}
	
	/**
	 * 设置用户名(发布人)
	 */
	public void setUserName(String userName){
		this.userName = userName;
	}
	
	/**
	 * 设置出租方式
	 */
	public void setRentWay(int rentWay){
		this.rentWay = rentWay;
	}
	
	/**
	 * 设置小区名称
	 */
	public void setEestateName(String estateName){
		this.estateName = estateName;
	}
	
	/**
	 * 设置房屋户型（厅）数量
	 */
	public void setHouseTingNum(int houseTingNum){
		this.houseTingNum = houseTingNum;
	}
	
	/**
	 * 设置房屋户型（室）数量
	 */
	public void setHouseRoomNum(int houseRoomNum){
		this.houseRoomNum = houseRoomNum;
	}
	
	/**
	 * 设置房屋户型（卫生间）数量
	 */
	public void setHouseToiletNum(int houseToiletNum){
		this.houseToiletNum = houseToiletNum;
	}
	
	/**
	 * 设置楼层数
	 */
	public void setLayerNum(int layerNum){
		this.layerNum = layerNum;
	}
	
	/**
	 * 设置楼层总数
	 */
	public void setTotleLayerNum(int totleLayerNum){
		this.totleLayerNum = totleLayerNum;
	}
	
	/**
	 * 设置平方米
	 */
	public void setSquareMeter(int squareMeter){
		this.squareMeter = squareMeter;
	}
	
	/**
	 * 设置是否在首页
	 */
	public void setIsHome(int isHome){
		this.isHome = isHome;
	}
	
	/**
	 * 设置修改时间
	 */
	public void setModifyTime(Date modifyTime){
		this.modifyTime = modifyTime;
	}
	
	/**
	 * 设置删除状态
	 */
	public void setIsDelete(int isDelete){
		this.isDelete = isDelete;
	}
	
	/**
	 * 设置卧室类型
	 */
	public void setRoomType(int roomType){
		this.roomType = roomType;
	}
	
	/**
	 * 设置性别要求
	 */
	public void setSexType(int sexType){
		this.sexType = sexType;
	}
	
	/**
	 * 设置房屋朝向
	 */
	public void setHouseDirection(int houseDirection){
		this.houseDirection = houseDirection;
	}
	
	/**
	 *设置装修情况
	 */
	public void setDecorationType(int houseDirection){
		this.decorationType = houseDirection;
	}
	
	/**
	 * 设置小区类型
	 */
	public void setEstateType(int estateType){
		this.estateType = estateType;
	}
	
	/**
	 * 设置租金
	 */
	public void setRentMoney(int rentMoney){
		this.rentMoney = rentMoney;
	}
	
	/**
	 * 设置付款方式
	 */
	public void setPayType(int payType){
		this.payType = payType;
	}
	
	/**
	 * 设置房屋描述
	 */
	public void setHouseDescrible(String houseDescrible){
		this.houseDescrible = houseDescrible;
	}
	
	/**
	 * 设置图片ID
	 */
	public void setImageId(String imageId){
		this.imageId = imageId;
	}
	
	/**
	 * 设置联系人
	 */
	public void setLinkMan(String linkMan){
		this.linkMan = linkMan;
	}
	
	/**
	 * 设置联系电话
	 */
	public void setLinkCallNumber(String linkCallNumber){
		this.linkCallNumber = linkCallNumber;
	}
	
	/**
	 * 设置审核是否通过
	 */
	public void setIsValid(int isValid){
		this.isValid = isValid;
	}
	
	/**
	 * 设置A1
	 */
	public void setA1(String a1){
		this.A1 = a1;
	}
	
	/**
	 * 设置A2
	 */
	public void setA2(String a2){
		this.A2 = a2;
	}
	
	/**
	 * 设置A3
	 */
	public void setA3(String a4){
		this.A3 = a4;
	}
	
	/**
	 * 设置A4
	 */
	public void setA4(String a4){
		this.A4 = a4;
	}
	
	/**
	 * 设置A5
	 */
	public void setA5(String a5){
		this.A5 = a5;
	}
	
	/**
	 * 设置A6
	 */
	public void setA6(String A6){
		this.A6 = A6;
	}
	
	/**
	 * 设置A7
	 */
	public void setA7(String A7){
		this.A7 = A7;
	}
	
	/**
	 * 设置A8
	 */
	public void setA8(String A8){
		this.A8 = A8; 
	}
	
	/**
	 * 获取A9
	 */
	public void setA9(String A9){
		this.A9 = A9;
	}
	
	/**
	 * 设置A10
	 */
	public void setA10(String A10){
		this.A10 = A10;
	}
	
	/**
	 * 设置A11
	 */
	public void setA11(String A11){
		this.A11 = A11;
	}
	
	/**
	 * 设置A12
	 */
	public void setA12(String A12){
		this.A12 = A12;
	}
	
	/**
	 * 设置A13
	 */
	public void setA13(String A13){
		this.A13 = A13;
	}
	
	/**
	 * 设置A14
	 */
	public void setA14(String A14){
		this.A14 = A14;
	}
	
	/**
	 * 设置A15
	 */
	public void setA15(String A15){
		this.A15 = A15;
	}
	
	/**
	 * 设置A16
	 */
	public void setA16(String A16){
		this.A16 = A16;
	}
	
	/**
	 * 设置 A17
	 */
	public void setA17(String A17){
		this.A17 = A17;
	}
	
	/**
	 * 设置A18
	 */
	public void setA18(String A18){
		this.A18 = A18;
	}
	
	/**
	 * 设置A19
	 */
	public void setA19(String A19){
		this.A19 = A19;
	}
	
	/**
	 * 设置A20
	 */
	public void setA20(String A20){
		this.A20 = A20;
	}
	
	/**
	 * 设置A21
	 */
	public void setA21(String A21){
		this.A21 = A21;
	}
	
	/**
	 * 设置A22
	 */
	public void setA22(String A22){
		this.A22 = A22;
	}
	
	/**
	 * 设置A23
	 */
	public void setA23(String A23){
		this.A23 = A23;
	}
	
	/**
	 * 设置A24
	 */
	public void setA24(String A24){
		this.A24 = A24;
	}
	
	/**
	 * 设置A25
	 */
	public void setA25(String A25){
		this.A25 = A25;
	}
	
	/**
	 * 设置A26
	 */
	public void setA26(String A26){
		this.A26 = A26;
	}
	
	/**
	 * 设置A27
	 */
	public void setA27(String A27){
		this.A27 = A27;
	}
	
	/**
	 * 设置A28
	 */
	public void setA28(String A28){
		this.A28 = A28;
	}
	
	/**
	 * 设置A29
	 */
	public void setA29(String A29){
		this.A29 = A29;
	}
	
	/**
	 * 设置A30
	 */
	public void setA30(String A30){
		this.A30 = A30;
	}
	
	/**
	 * 设置房屋标题
	 * @param 房屋标题
	 */
	public void setHouseTitle(String houseTitle){
		this.houseTitle = houseTitle;
	}
	
	/**
	 * 获取地址
	 */
	public void	setAddress(String address){
		this.address = address;
	}
	/**
	 * 设置位置（区域)
	 */
	public void setAddressArea(String addressArea){
		this.addressArea = addressArea;
	}
	/**
	 * 设置位置（商圈)
	 */
	public void setAddressCircle(String addressCircle){
		this.addressCircle = addressCircle;
	}
}
