package ulezu.com.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;

import ulezu.com.util.EscapeAndUnescapeUtil;

/**
 * 拦截器
 * @author Administrator
 *
 */
public class UrlFilter implements Filter {

	/**
	 * 不用检查的URL
	 */
	private List<String> noCheckURLList = new ArrayList<String>();
	/**
	 * 过滤不通过返回的页面
	 */
	private String redirectURL = null;
	/**
	 * Session秘钥
	 */
	private String sessionKey = null;
	
	/**
	 * 用户名
	 */
	private String userName = null;

	/**
	 * destory
	 */
	public void destroy() {
	}

	/**
	 * Filter初始化
	 */
	public void init(FilterConfig filterConfig) throws ServletException {
		/**
		 * 暂时做成配置，后面从数据库里面做
		 */
		redirectURL = filterConfig.getInitParameter("redirectURL");
		sessionKey = filterConfig.getInitParameter("sessionKey");
		String noCheckURLListStr = filterConfig.getInitParameter("noCheckURLList");
		if(noCheckURLListStr!=null){
			StringTokenizer st = new StringTokenizer(noCheckURLListStr, ";");
			noCheckURLList.clear();
			while(st.hasMoreTokens()){
				noCheckURLList.add(st.nextToken());
			}
		}
	}

	/**
	 * 拦截方法
	 */
	public void doFilter(ServletRequest servletRequest,
			ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
//		request.setCharacterEncoding("UTF-8");
//		Cookie[] cookies = request.getCookies();
//		if(cookies == null){
//			response.sendRedirect(redirectURL);
//			return;
//		}
//		String user = request.getParameter("userName");
//		if(cookies.length == 0 ||cookies.length == 1){
//			response.sendRedirect(redirectURL);
//			return;
//		}
//		
//		for(int i=0 ;i<cookies.length;i++){
//			if(!cookies[i].getName().equals("JSESSIONID") && user!=null){
//				String cookieVlaue = cookies[i].getValue();
//				String cookieJson = EscapeAndUnescapeUtil.unescape(cookieVlaue);
//				JSONObject jsonObject = null;
//				String name = "";
//				try{
//					jsonObject = new JSONObject(cookieJson);
//					name = jsonObject.getString("userName");
//				}
//				catch (Exception e) {
//					e.printStackTrace();
//				}
//				
//				if(cookies[i].getName().equals("user.ulezu.com") && !name.equals(user)){
//					response.sendRedirect(redirectURL);
//					return;
//				}
//			}
//			
//			if(cookies[i].getName().equals("user.ulezu.com")){
//				userName = cookies[i].getValue();
//				String cookieJson = EscapeAndUnescapeUtil.unescape(userName);
//				JSONObject jsonObject = null;
//				try{
//					jsonObject = new JSONObject(cookieJson);
//					userName = jsonObject.getString("userName");
//				}
//				catch (Exception e) {
//					e.printStackTrace();
//				}
//				break;
//			}
//		}
//		HttpSession session = request.getSession();
//		sessionKey = (String) session.getAttribute("" + userName + "");
//		if(sessionKey==null){
//			response.sendRedirect(redirectURL);
//			return;
//		}
		
		chain.doFilter(request, response);
	}

	/**
	 * 不需教研的过滤请求
	 * @param request
	 * @return
	 */
	private boolean checkNotRequestFilter(HttpServletRequest request){
		String uri = request.getServletPath()+(request.getPathInfo()==null?"":request.getPathInfo());
		//不包含该uri--false
		return noCheckURLList.contains(uri);
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
