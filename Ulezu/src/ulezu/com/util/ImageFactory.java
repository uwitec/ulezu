package ulezu.com.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGEncodeParam;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

/**
 * 图片工厂
 * @author shenyuchuan
 *
 */
public class ImageFactory {
	/**
	 * 生成电话号码图片
	 * @param out 输出流
	 * @param phoneNum 电话号码
	 * @author shenyuchuan
	 */
	public static void generateCellPhoneNumber(OutputStream out, String phoneNum){
		int width = 150;
		int height = 28;
		BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics2D g = bi.createGraphics();
		g.setBackground(Color.WHITE);
		g.fillRect(0, 0, width, height);
		g.setColor(Color.RED);
		g.setFont(new Font("隶书",Font.BOLD, 24));
		g.drawString(phoneNum, 1, 20);
		bi.flush();
		JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
		JPEGEncodeParam param = encoder.getDefaultJPEGEncodeParam(bi);
		param.setQuality(1.0f, false);
		encoder.setJPEGEncodeParam(param);
		try {
			encoder.encode(bi);
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}finally{
			g.dispose();
		}
	}
	
	/**
	 * 生成验证码
	 * @param out 输出流
	 * @author shenyuchuan
	 */
	public static void generateValidateCode(OutputStream out){
		int width = 150;
		int height = 28;
		BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics2D g = bi.createGraphics();
		g.setBackground(Color.WHITE);
		g.fillRect(0, 0, width, height);
		g.setColor(Color.RED);
		g.setFont(new Font("隶书",Font.BOLD, 24));
		g.drawString("1121", 1, 20);
		bi.flush();
		JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
		JPEGEncodeParam param = encoder.getDefaultJPEGEncodeParam(bi);
		param.setQuality(1.0f, false);
		encoder.setJPEGEncodeParam(param);
		try {
			encoder.encode(bi);
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}finally{
			g.dispose();
		}
	}
}
