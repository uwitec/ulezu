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
		Integer random = new Random().nextInt(4);
		String rendomStr = random.toString();
		if(rendomStr.length() != 4){
			while (rendomStr.length() < 4) {
				rendomStr += "0";
			}
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
}
