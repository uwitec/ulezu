/**
 * 
 */
package ulezu.com.common;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author 鐢抽奔宸�
 * MD5鍔犲瘑瀵嗙爜
 *
 */
public class MD5Encrypt {
	/**
	 * 瀵瑰瘑鐮佽繘琛孧D5鍔犲瘑(32涓哄姞瀵�
	 * @param password 鐢ㄦ埛杈撳叆鐨勫瘑鐮�
	 */
	public static String encryptMD5To32(String password){
		StringBuffer sb = null;
		try{
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			md5.update(password.getBytes());
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
	 * 瀵瑰瘑鐮佽繘琛孧D5鍔犲瘑(16浣嶄负鍔犲瘑)
	 * @param password 鐢ㄦ埛杈撳叆鐨勫瘑鐮�
	 */
	public static String encryptMD5To16(String password){
		return encryptMD5To32(password).substring(8,24);
	}
}
