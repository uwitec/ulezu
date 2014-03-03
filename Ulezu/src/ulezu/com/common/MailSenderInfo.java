package ulezu.com.common;

import java.util.Properties;

/**
 * 发送邮件需要使用的基本信息 
 */
public class MailSenderInfo {
	/**
	 * 发送邮件的服务器的IP
	 */
	private String mailServerHost;
	
	/**
	 * 发送邮件的服务器的端口 
	 */
	private String mailServerPort = "25";
	
	/**
	 * 邮件发送者的地址
	 */
	private String fromAddress;
	
	/**
	 *  邮件接受者的地址
	 */
	private String toAddress;
	
	/**
	 * 登陆邮件发送服务器的用户名
	 */
    private String userName;   
    
    /**
     * 登陆邮件发送服务器的密码  
     */
    private String password;
    
    /**
     * 是否需要身份验证   
     */
    private boolean validate = false;   
    /**
     *  邮件主题   
     */
    private String subject;   
    // 邮件的文本内容   
    private String content;
    /**
     * 邮件附件的文件名
     */
    private String[] attachFileNames;
    
    /**  
     * 获得邮件会话属性  
     */    
    public Properties getProperties(){
    	Properties p = new Properties();
    	p.put("mail.smtp.host", this.mailServerHost);
    	p.put("mail.smtp.port",this.mailServerPort);
    	p.put("mail.smtp.auth", validate ? "true" : "false");
    	return p;
    }
    
    /**
     * 获取邮件服务器
     * @return 邮件服务器
     */
	public String getMailServerHost() {
		return mailServerHost;
	}
	
	/**
	 * 设置邮件服务器
	 * @param mailServerHost 邮件服务器
	 */
	public void setMailServerHost(String mailServerHost) {
		this.mailServerHost = mailServerHost;
	}
	
	/**
	 * 获取邮件服务器端口
	 * @return 邮件服务器端口
	 */
	public String getMailServerPort() {
		return mailServerPort;
	}
	
	/**
	 * 设置邮件服务器端口
	 * @param mailServerPort邮件服务器端口
	 */
	public void setMailServerPort(String mailServerPort) {
		this.mailServerPort = mailServerPort;
	}
	
	/**
	 * 得到发送者地址
	 * @return 发送者地址
	 */
	public String getFromAddress() {
		return fromAddress;
	}
	
	/**
	 * 设置发送者地址
	 * @param fromAddress 发送者地址 
	 */
	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}
	
	/**
	 * 得到接收者地址
	 * @return 接收者地址
	 */
	public String getToAddress() {
		return toAddress;
	}
	
	/**
	 * 设置接受者地址
	 * @param toAddress 接受者地址
	 */
	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}
	
	/**
	 * 得到用户名
	 * @return 用户名
	 */ 
	public String getUserName() {
		return userName;
	}
	
	/**
	 * 设置用户名
	 * @param userName 用户名
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/**
	 * 得到密码
	 * @return  密码
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * 设置密码
	 * @param password 密码
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * 是否验证
	 * @return 是否验证
	 */
	public boolean isValidate() {
		return validate;
	}
	
	/**
	 * 设置是否验证
	 * @param validate 是否验证
	 */
	public void setValidate(boolean validate) {
		this.validate = validate;
	}
	
	/**
	 * 得到邮件主题
	 * @return 邮件主题
	 */
	public String getSubject() {
		return subject;
	}
	
	/**
	 * 设置邮件主题
	 * @param subject 邮件主题
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	/**
	 * 得到邮件内容
	 * @return 邮件内容
	 */
	public String getContent() {
		return content;
	}
	
	/**
	 * 设置邮件内容
	 * @param content邮件内容
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
	/**
	 * 获取附件
	 * @return 附件
	 */
	public String[] getAttachFileNames() {
		return attachFileNames;
	}
	
	/**
	 * 设置附件
	 * @param attachFileNames 附件
	 */
	public void setAttachFileNames(String[] attachFileNames) {
		this.attachFileNames = attachFileNames;
	}  
}
