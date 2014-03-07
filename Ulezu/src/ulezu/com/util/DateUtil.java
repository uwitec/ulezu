package ulezu.com.util;

import java.text.ParseException;
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
	
	/**
	 * 获取两个时间相差的天数
	 * @param startTime 开始时间
	 * @param endTime 结束时间
	 * @throws Exception 抛出异常
	 */
	public static long getDateDiffDays(String startTime, String endTime) throws Exception {
		//按照传入的格式生成一个simpledateformate对象
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		long nd = 1000*24*60*60;//一天的毫秒数
		//获得两个时间的毫秒时间差异
		long diff = sd.parse(endTime).getTime() - sd.parse(startTime).getTime();
		
		return diff/ nd;
	}
	
	/**
	 * 获取两个时间相差的小时数
	 * @param startTime 开始时间
	 * @param endTime 结束时间
	 * @throws Exception 抛出异常
	 */
	public static long getDateDiffHours(String startTime, String endTime) throws Exception {
		//按照传入的格式生成一个simpledateformate对象
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		long nh = 1000*60*60;//一小时的毫秒数
		//获得两个时间的毫秒时间差异
		long diff = sd.parse(endTime).getTime() - sd.parse(startTime).getTime();
		
		return diff/ nh;
	}
	
	/**
	 * 获取两个时间相差的分钟数
	 * @param startTime 开始时间
	 * @param endTime 结束时间
	 * @throws Exception 抛出异常
	 */
	public static long getDateDiffMinutes(String startTime, String endTime) throws Exception {
		//按照传入的格式生成一个simpledateformate对象
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		long nm = 1000*60;//一分钟的毫秒数
		//获得两个时间的毫秒时间差异
		long diff = sd.parse(endTime).getTime() - sd.parse(startTime).getTime();
		
		return diff/ nm;
	}
}
