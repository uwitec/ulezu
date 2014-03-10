package ulezu.com.util;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * json处理类
 * @author shenyuc629
 *
 */
public class JsonHelper {
	/**
	 * @see 把json对象以json格式的数据输出到页面
	 * @param Object obj 是一个对象形式，类似User
	 */
	public static void printObjectToJsonString(HttpServletResponse response, Object obj){
		response.setCharacterEncoding("UTF-8");
		try {
			response.getWriter().print(net.sf.json.JSONObject.fromObject(obj).toString());
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	/**
	 * @see 把josn集合json格式的数据输出到页面
	 * @param Object objList 是一个集合形式，类似List<Object>
	 */
	public static void printObjectListToJsonString(HttpServletResponse response,Object objList){
		response.setCharacterEncoding("UTF-8");
		net.sf.json.JSONObject jo = new net.sf.json.JSONObject();
		jo.put("list", objList);
		try {
			response.getWriter().print(jo);
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	/**
	 * 从request中读取字符串对象并且返回对象的json字符串
	 * @param request
	 * @return
	 */
	public static String readJSONString(HttpServletRequest request){
		StringBuffer json = new StringBuffer();
		String line = null;
		try {
			BufferedReader reader = request.getReader();
			while((line = reader.readLine()) != null) {
				json.append(line);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return json.toString();
	}
}
