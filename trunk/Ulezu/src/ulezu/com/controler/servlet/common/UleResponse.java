package ulezu.com.controler.servlet.common;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
/**
 * 响应对象
 * @author Administrator
 *
 */
public class UleResponse {
	/**
	 * 往浏览器输出客户端信息
	 * @param response response对象
	 * @param args 输出信息
	 */
	public static void response(HttpServletResponse response, String args){
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=utf-8");
		response.setHeader("Cache-Control", "no-cache");
		try {
			response.getWriter().print(args);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
