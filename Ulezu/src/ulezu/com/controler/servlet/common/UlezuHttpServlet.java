package ulezu.com.controler.servlet.common;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UlezuHttpServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * doGet方法
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
	
	/**
	 * 往浏览器输出json格式客户端信息 
	 * @param response response对象
	 * @param args 输出信息
	 */
	protected void response(HttpServletResponse response, String args){
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=utf-8");
		response.setHeader("Cache-Control", "no-cache");
		try {
			response.getWriter().print(args);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 带参数跳转到指定url
	 *@author qw
	 *@version 创建时间:2014-3-14下午03:30:31
	 *@param request
	 *@param response
	 */
	protected void forwardToUrl(HttpServletRequest request,
			HttpServletResponse response, String url) {
		RequestDispatcher rd = request.getRequestDispatcher(url) ;
		try {
			rd.forward(request,response) ;
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 获取Json提示
	 * @param args  提示的参数
	 * @return 返回Json提示字符串
	 */
	protected String getJsonMsg(String args){
		return "{\"data\": \"" + args + "\"}";
	}
	
	protected<T> T initObject(HttpServletRequest request) {
		
		return null;
	}
}
