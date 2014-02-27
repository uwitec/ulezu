//*******************************//
//<xml fileName="CUserServlet.java" ?>
//<author>申鱼川</author>
//<dateTime>2014-02-23</dateTime>
//</xml>
//*******************************//
package ulezu.com.controler.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ulezu.com.business.BUser;
import ulezu.com.controler.servlet.common.UlezuHttpServlet;
import ulezu.com.model.MUser;

/**
 * 用户Servlet
 */
public class CUserServlet extends UlezuHttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 用户处理类
	 */
	private BUser userHander = null;
       
    /**
     * @see CUserServlet构造类
     */
    public CUserServlet() {
        super();
    }

    /**
     * 初始化方法
     */
    @Override
    public void init() throws ServletException {
    	this.userHander = new BUser();
    }

	/**
	 * doPost方法
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		int type = Integer.parseInt(request.getParameter("type"));
		int loginType = Integer.parseInt(request.getParameter("loginType"));
		String message = "";
		switch(type){
			case 0 :
				//登录
				String loginCode = request.getParameter("loginCode");
				String password = request.getParameter("password");
				MUser user = this.SetUserLoginName(loginType, loginCode, password);
				if(this.userHander.login(user)){
					request.getRequestDispatcher("/home.jsp").forward(request, response);
				}else{
					message = this.getJsonMsg("false");
				}
				break;
			case 1 :
				String email = request.getParameter("email");
				if(this.userHander.register(email)){
					message = this.getJsonMsg("true");
				}else{
					message = this.getJsonMsg("false");
				}
				//注册
				break;
			case 2 :
				//修改用户信息
				break;
			default:
				message = this.getJsonMsg("false");
					break;
		}
		
		this.response(response, message);
	}
	
	/**
	 * 设置用户登录名
	 * @param loginType 登录方式（0-用户名，1-手机号码，2-邮箱）
	 * @param loginCode 用户名or手机号码or邮箱
	 * @param password 登录密码
	 * @return 返回用户对象
	 */
	private MUser SetUserLoginName(int loginType, String loginCode, String password){
		MUser user = new MUser();
		user.setUserPassword(password);
		switch(loginType)
		{
			case 0:
				user.setUserName(loginCode);
				break;
			case 1:
				user.setPhoneNum(loginCode);
				break;
			case 2:
				user.setEmail(loginCode);
				break;
			default:
				user.setUserName(loginCode);
				break;
		}
		
		return user;
	}

}
