package ulezu.com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ulezu.com.model.MUser;

public class UrlFilter implements Filter {

	@SuppressWarnings("unused")
	private FilterConfig filterConfig;
	private HttpServletRequest request;
	private HttpServletResponse response;

	public void destroy() {
		this.filterConfig = null;
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
	}

	public void doFilter(ServletRequest servletRequest,
			ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {
		this.request = (HttpServletRequest) servletRequest;
		this.response = ((HttpServletResponse) servletResponse);
		String url = request.getServletPath();
		if (url == null)
			url = "";
		HttpSession session = request.getSession();
		MUser user = (MUser) session.getAttribute("user");
		
		chain.doFilter(request, response);
		if (this.noFileUrl(url, request)) { // 不需要判断权限的请求如登录页面，则跳过
			chain.doFilter(request, response);
		} else if (user == null) {
			String action = request.getParameter("action");
			if (!"userMapping".equals(action)) {
				response.sendRedirect("/home.jsp");// 返回登录页面
			}
		} else {
			verifyUrl(url, user);// 判断当前user是否拥有访问此url的权限
		}
	}

	/**
	 * 
	 * @param url
	 *            当前请求的url
	 * @param user
	 *            当前登录用户
	 * @throws IOException
	 * @throws ServletException
	 */
	private void verifyUrl(String url, MUser user) throws IOException,
			ServletException {
		
	}

	/**
	 * 是否需要判断权限,如客户端浏览、登录页面则不需要判断权限
	 */

	protected boolean noFileUrl(String url, HttpServletRequest request) {
		if (url.indexOf("/home.jsp") >= 0 || url.indexOf("/register.jsp") >= 0 || url.indexOf("userMapping") > 0) {
			return true;
		}
		return false;
	}
}
