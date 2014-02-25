package ulezu.com.util;

/**
 * 缂栬瘧鍜屽弽缂栬瘧
 * @author Administrator
 *
 */
public class EscapeAndUnescapeUtil {
	/**
	 * 缂栬瘧
	 * @param src 缂栬瘧鐨勫瓧绗︿覆
	 * @return 杩斿洖缂栬瘧鐨勫瓧绗︿覆
	 */ 
	public static String escape(String src) {  
        int i;  
        char j;  
        StringBuffer tmp = new StringBuffer();  
        tmp.ensureCapacity(src.length() * 6);  
        for (i = 0; i < src.length(); i++) {  
            j = src.charAt(i);  
            if (Character.isDigit(j) || Character.isLowerCase(j)  
                    || Character.isUpperCase(j))  
                tmp.append(j);  
            else if (j < 256) {  
                tmp.append("%");  
                if (j < 16)  
                    tmp.append("0");  
                tmp.append(Integer.toString(j, 16));  
            } else {  
                tmp.append("%u");  
                tmp.append(Integer.toString(j, 16));  
            }  
        }  
        return tmp.toString();  
    }  
 
	/**
	 * 鍙嶇紪璇�
	 * @param src 鍙嶇紪璇戠殑瀛楃涓�
	 * @return 杩斿洖鍙嶇紪璇戠殑瀛楃涓茬殑缁撴灉
	 */
    public static String unescape(String src) {  
        StringBuffer tmp = new StringBuffer();  
        tmp.ensureCapacity(src.length());  
        int lastPos = 0, pos = 0;  
        char ch;  
        while (lastPos < src.length()) {  
            pos = src.indexOf("%", lastPos);  
            if (pos == lastPos) {  
                if (src.charAt(pos + 1) == 'u') {  
                    ch = (char) Integer.parseInt(src  
                            .substring(pos + 2, pos + 6), 16);  
                    tmp.append(ch);  
                    lastPos = pos + 6;  
                } else {  
                    ch = (char) Integer.parseInt(src  
                            .substring(pos + 1, pos + 3), 16);  
                    tmp.append(ch);  
                    lastPos = pos + 3;  
                }  
            } else {  
                if (pos == -1) {  
                    tmp.append(src.substring(lastPos));  
                    lastPos = src.length();  
                } else {  
                    tmp.append(src.substring(lastPos, pos));  
                    lastPos = pos;  
                }  
            }  
        }  
        return tmp.toString();  
    }  
}
