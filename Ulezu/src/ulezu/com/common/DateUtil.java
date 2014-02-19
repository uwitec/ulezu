package ulezu.com.common;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtil {
	/**
	 * 取得当前时间的字符串，格式为"yyyy-MM-dd hh:mm:ss"
	 * 
	 * @return
	 * @author shenyc 2012-3-29 下午2:45:44
	 */
	public static String getDate(){
		return getDate("yyyy-MM-dd HH:mm:ss");
	}
	/**
	 * 返回指定格式的日期字符串。
	 * 
	 * @see SimpleDateFormat
	 * @param pattern
	 *            SimpleDateFormat提供的所有格式
	 * @return
	 * @author shenyc 2012-3-29 下午2:45:44
	 */
	public static String getDate(String pattern){
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String date = sdf.format(cal.getTime());
		return date;
	}
	/**
	 * 把时间毫秒数转成给定格式的日期格式
	 * 
	 * @param time
	 *            时间的毫秒数
	 * @param pattern
	 *            SimpleDateFormat提供的所有格式
	 * @return
	 * @author shenyc 2012-3-29 下午2:45:44
	 */
	
	public static String getDate(long time,String pattern){
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(time);
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		String date =format.format(cal.getTime());
		return date;
	}
	
	/**
	 * 把时间毫秒数转成默认日期格式"yyyy-MM-dd hh:mm:ss"
	 * 
	 * @param time
	 *            时间的毫秒数
	 * @return
	 * @author shenyc 2012-3-29 下午2:45:44
	 */
	public static String getDate(long time){
		return getDate(time,"yyyy-MM-dd HH:mm:ss");
	}
}
