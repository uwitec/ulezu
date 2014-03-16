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
import javax.servlet.http.HttpSession;

import ulezu.com.business.BUser;
import ulezu.com.controler.servlet.common.UlezuHttpServlet;
import ulezu.com.model.MUser;
import ulezu.com.util.AESEncryptAndDecrypt;

/**
 * 用户Servlet
 */
public class CUserServlet extends UlezuHttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Session
	 */
	private HttpSession session; 
	
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
		/*
		 * type用请求类型，0登录，1注册（发送激活邮件），2邮件确认并修改（如果存在）或保存（如果不存在）用户信息
		 */
		int type = Integer.parseInt(request.getParameter("type"));
		String message = "";
		switch(type){
			case 0 :
				//登录
				String loginCode = request.getParameter("userName");
				String password = request.getParameter("password");
				int loginType = this.parseLoginType(loginCode);//登录方式（0-用户名，1-手机号码，2-邮箱）
				if(this.userHander.login(this.SetUserLoginMessage(loginType, loginCode, password))){ 
					this.session = request.getSession();
					session.setAttribute("" + loginCode + "", AESEncryptAndDecrypt.encrypt(loginCode + "^" + password));
					request.getRequestDispatcher("/home.jsp").forward(request, response);
				}else{
					message = this.getJsonMsg("false");
				}
				
				break;				
			case 1 :
				//注册
				String email = request.getParameter("email");
				if(this.userHander.sendActivateEmail(email)){
					message = this.getJsonMsg("true");
				}else{
					message = this.getJsonMsg("邮件发送出错");
				}
				
				break;
			case 2 :
				//邮箱验正成功，用户修改信息
				MUser user = new MUser();
				break;
			default:
				message = this.getJsonMsg("false");
					break;
		}
		
		super.response(response, message);
	}
	
	/**
	 * 设置用户登录名
	 * @param loginType 登录方式（0-用户名，1-手机号码，2-邮箱）
	 * @param loginCode 用户名or手机号码or邮箱
	 * @param password 登录密码
	 * @return 返回用户对象
	 */
	private MUser SetUserLoginMessage(int loginType, String loginCode, String password){
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
	
	/**
	 * 根据用户名解析登陆类型
	 * @param userName 用户名
	 * @return  返回登录方式（0-用户名，1-手机号码，2-邮箱）
	 */
	private int parseLoginType(String userName){
		if(userName.contains("@")){
			return 2;
		}else if(userName.matches("^[1][358]\\d{9}$")){
			return 1;
		}else{
			return 0;
		}
	}

}
