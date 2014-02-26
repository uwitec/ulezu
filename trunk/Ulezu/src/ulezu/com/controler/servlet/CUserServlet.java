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
		String userName = request.getParameter("loginName");
		String password = request.getParameter("password");
		String message = "";
		switch(Integer.parseInt(request.getParameter("type"))){
			case 0 :
				//登录
				if(this.userHander.login(userName, password)){
					message = this.getJsonMsg("true");
				}else{
					message = this.getJsonMsg("false");
				}
				break;
			case 1 :
				if(this.userHander.register(this.SetUserLoginName(Integer.parseInt(request.getParameter("loginType")), userName, password)) > 0){
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
	 * @param args 用户名or手机号码or邮箱
	 * @param args 登录密码
	 * @return 返回用户对象
	 */
	private MUser SetUserLoginName(int loginType, String args, String password){
		MUser user = new MUser();
		user.setUserPassword(password);
		switch(loginType)
		{
			case 0:
				user.setUserName(args);
				break;
			case 1:
				user.setPhoneNum(args);
				break;
			case 2:
				user.setEmail(args);
				break;
			default:
				user.setUserName(args);
				break;
		}
		
		return user;
	}

}
