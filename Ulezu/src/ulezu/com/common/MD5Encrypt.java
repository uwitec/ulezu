/**
 * 
 */
package ulezu.com.common;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author 申鱼川
 * MD5加密
 *
 */
public class MD5Encrypt {
	/**
	 * MD5加密成32位
	 * @param param 加密参数
	 */
	public static String encryptMD5To32(String param){
		StringBuffer sb = null;
		try{
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			md5.update(param.getBytes());
			byte b[] = md5.digest();
			int i = 0;
			sb = new StringBuffer("");
			for(int offset=0; offset < b.length;offset++){
				i = b[offset];
				if(i<0) 
					i+=256;
				if(i<16)
					sb.append(0);
				sb.append(Integer.toHexString(i));
			}
		}catch(NoSuchAlgorithmException ex){
			ex.printStackTrace();
		}
		return sb.toString();
	}
	
	/**
	 * MD5加密成16位
	 * @param param 加密参数
	 */
	public static String encryptMD5To16(String param){
		return encryptMD5To32(param).substring(8,24);
	}
}
