package ulezu.com.common;

import java.util.Properties;

/**
 * 邮件工厂
 * @author Administrator
 *
 */
public class EmailFactory {
	/**
	 * 发送Html邮件（最好用异步线程发送）
	 * @param emailAddress 邮件地址
	 * @return  返回是否发送成功
	 */
	public static boolean sendHtmlEmail(String emailAddress){
		boolean result = false;
		try{
			//这个类主要来发送邮件  
		    SimpleMailSender sms = new SimpleMailSender();  
		    //sms.sendTextMail(mailInfo);//发送文体格式   
		    result = sms.sendHtmlMail(setMailSenderInfo(emailAddress));//发送html格式
		}catch(Exception ex){
			ex.printStackTrace();
			result = false; 
		}
		
		return result;
	}
	
	/**
	 * 发送Text邮件（最好用异步线程发送）
	 * @param emailAddress 邮件地址
	 * @return  返回是否发送成功
	 */
	public static boolean sendTextEmail(String emailAddress){
		boolean result = false;
		try{
			//这个类主要来发送邮件  
		    SimpleMailSender sms = new SimpleMailSender();  
		    //sms.sendTextMail(mailInfo);//发送文体格式   
		    result = sms.sendTextMail(setMailSenderInfo(emailAddress));//发送html格式
		}catch(Exception ex){
			ex.printStackTrace();
			result = false; 
		}
		
		return result;
	}
	
	/**
	 * 设置邮件发送信息（暂时写死）
	 * @param emailAddress 邮件地址
	 * @return 返回邮件发送信息
	 */
	private static MailSenderInfo setMailSenderInfo(String emailAddress){
		MailSenderInfo mailInfo = new MailSenderInfo();   
		mailInfo.setMailServerHost("smtp.exmail.qq.com");   
	    mailInfo.setMailServerPort("465");   
	    mailInfo.setValidate(true);
	    mailInfo.setUserName("449614531@qq.com");   
	    mailInfo.setPassword("shenyuc026963");//您的邮箱密码   
	    mailInfo.setFromAddress("449614531@qq.com"); 
	    // 目标邮件地址
	    mailInfo.setToAddress(emailAddress); 
	    //发送的邮件内容
	    String emailHtml = "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\"><html>" +
	    		"<head>" +
	    		"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">" +
	    		"<title>恭喜您成功注册优乐租，请进行邮箱认证，完成注册 </title>" +
	    		"</head>" +
	    		"<body>" +
	    		"尊敬的用户 ：<br/><br/>" +
	    		"您好，恭喜您成为<a href=\"http://www.shuonar.com\" style=\"color:green;\">优乐租</a>的会员, 您的用户名是: "+emailAddress+"<br/>" +
	    		"为了您的账户安全，请您点击下面的链接，进行邮箱验证：<br  />" +
	    		"<a href=\"http://localhost:8080/Naer/checkuseractivate?status="+setStatus(emailAddress)+"&email="+emailAddress+"\" style=\"color:#1c86ee;\">http://www.shuonar.com/checkuseractivate?status="+setStatus(emailAddress)+"&email="+emailAddress+"</a><br  />" +
	    		"如果以上链接无法点击，请将上面的地址复制到您的浏览器(如ie/firefox/chrome)的地址栏打开。<br  />" +
	    		"请牢记您的用户名和注册使用的邮件地址, 您将使用它们登录<a href=\"http://www.shuonar.com\" style=\"color:green;\">优乐租</a>进行资料的使用和分享！<br/><br/><br/>" +
	    		"如果这封邮件是一封意外邮件，请你忽略它，也有可能是你的邮箱被他人盗用，<a href=\"www.shuonar.com\" style=\"color:green;\">优乐租</a>给你带来的不便请原谅！<br/>" +
	    		"</body>" +
	    		"</html>";
	    mailInfo.setSubject("尊敬的用户，你好，这是优乐租邮箱认证邮件！");   
	    mailInfo.setContent(emailHtml);   
	    return mailInfo;
	}
	
	/**
	 * 设置用户状态（模糊含义是用户密码）
	 * @param emailAddress  邮件地址
	 * @return 加密的初始化密码
	 */
	private static String setStatus(String emailAddress){
		 return MD5Encrypt.encryptMD5To32(emailAddress);
	}
	
	public static void  main(String[] args){
		boolean result = sendHtmlEmail("1966225457@qq.com");
		System.out.println(result);
	}
}
