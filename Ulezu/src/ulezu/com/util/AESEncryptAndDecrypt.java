package ulezu.com.util;

import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 * This program generates a AES key, retrieves its raw bytes, and then
 * reinstantiates a AES key from the key bytes. The reinstantiated key is used
 * to initialize a AES cipher for encryption and decryption.
 */

public class AESEncryptAndDecrypt {

	// private static final String CRYPT_KEY = "YUUAtestYUUAtest";

	/**
	 * 加密
	 * 
	 * @param content
	 *            需要加密的内容
	 * @param password
	 *            加密密码
	 * @return
	 * @throws Exception
	 */
	private static byte[] encrypt(byte[] content, String password)
			throws Exception {
		KeyGenerator kgen = KeyGenerator.getInstance("AES");
		kgen.init(128, new SecureRandom(password.getBytes()));
		SecretKey secretKey = kgen.generateKey();
		byte[] enCodeFormat = secretKey.getEncoded();
		SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
		Cipher cipher = Cipher.getInstance("AES");// 创建密码器
		cipher.init(Cipher.ENCRYPT_MODE, key);// 初始化
		return cipher.doFinal(content);
	}
	
    /**解密
     * @param content  待解密内容
     * @param password 解密密钥
     * @return
     * @throws Exception 
     */
	private static byte[] decrypt(byte[] content, String password) throws Exception {
                     KeyGenerator kgen = KeyGenerator.getInstance("AES");
                     kgen.init(128, new SecureRandom(password.getBytes()));
                     SecretKey secretKey = kgen.generateKey();
                     byte[] enCodeFormat = secretKey.getEncoded();
                     SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");            
                     Cipher cipher = Cipher.getInstance("AES");// 创建密码器
                    cipher.init(Cipher.DECRYPT_MODE, key);// 初始化
                    return cipher.doFinal(content);
         }
	/**
	 * 二行制转十六进制字符串
	 * 
	 * @param b
	 * @return
	 */
	private static String byte2hex(byte[] b) {
		String hs = "";
		String stmp = "";
		for (int n = 0; n < b.length; n++) {
			stmp = (java.lang.Integer.toHexString(b[n] & 0XFF));
			if (stmp.length() == 1)
				hs = hs + "0" + stmp;
			else
				hs = hs + stmp;
		}
		return hs.toUpperCase();
	}

	private static byte[] hex2byte(byte[] b) {
		if ((b.length % 2) != 0)
			throw new IllegalArgumentException("长度不是偶数");
		byte[] b2 = new byte[b.length / 2];
		for (int n = 0; n < b.length; n += 2) {
			String item = new String(b, n, 2);
			b2[n / 2] = (byte) Integer.parseInt(item, 16);
		}
		return b2;
	}

	/**
	 * 解密
	 * 
	 * @param data
	 * @param key
	 *            16位长,加密度字符key
	 * @return
	 * @throws Exception
	 */
	public final static String decrypt(String data, String key)
			throws Exception {
		return new String(decrypt(hex2byte(data.getBytes()), key));
	}

	/**
	 * 加密
	 * 
	 * @param data
	 * @param key
	 *            16位长,加密度字符key
	 * @return
	 * @throws Exception
	 */
	public final static String encrypt(String data, String key)
			throws Exception {
		return byte2hex(encrypt(data.getBytes(), key));

	}

	public static void main(String[] args) {
		try {
			String a = AESEncryptAndDecrypt.encrypt("948aaa2d18", "EMAILASEMAIL");
			System.out.println(a);
			System.out.println(AESEncryptAndDecrypt.decrypt(a, "EMAILASEKEYEMAIL"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
