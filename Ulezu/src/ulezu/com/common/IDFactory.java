package ulezu.com.common;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

/**
 * ID工厂
 * @author Administrator
 *
 */
public class IDFactory {
	static Random  random = new Random(System.currentTimeMillis());
	/**
	 * 获取ID
	 * @param databaseName 数据库名
	 * @param tableName  表名
	 * @return 返回ID
	 */
	public static String getId(String databaseName, String tableName){
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		String header = sdf.format(cal.getTime());
		String rendomStr = String.valueOf(Math.abs(random.nextInt()));
		if(rendomStr.length() != 4){
			rendomStr = rendomStr.substring(0, 4);
		}
		
		if(databaseName.length() > 4){
			databaseName = databaseName.substring(0, 4).toLowerCase();
		}else{
			while (databaseName.length() < 4) {
				databaseName += "0";
			}
		}
		
		if(tableName.length() > 4){
			tableName = tableName.substring(0, 4).toLowerCase();
		}else{
			while (tableName.length() < 4) {
				tableName += "0";
			}
		}
		
		return header + rendomStr + databaseName + tableName + "0001"; 
	}
	
	public static void main(String[] args) {
		System.out.println(IDFactory.getId("ulezu", "houseInfo"));
		System.out.println(IDFactory.getId("ulezu", "houseInfo"));
		System.out.println(IDFactory.getId("ulezu", "houseInfo"));
		System.out.println(IDFactory.getId("ulezu", "houseInfo"));
		System.out.println(IDFactory.getId("ulezu", "houseInfo"));
	}
}
