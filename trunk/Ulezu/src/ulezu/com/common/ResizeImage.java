package ulezu.com.common;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ResizeImage {
	private static BufferedImage tag;
	public static BufferedImage getMaxImage(String filepath){
		try {
			BufferedImage bi = ImageIO.read(new File(filepath));
			Image image = bi.getScaledInstance(120, 120, Image.SCALE_DEFAULT);
			tag = new BufferedImage(120, 120, BufferedImage.TYPE_INT_BGR);
			Graphics g = tag.getGraphics();
			g.drawImage(image, 0, 0, null);
			g.dispose();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return tag;
		
	}
	public static BufferedImage getMinImage(String filepath){
		try {
			BufferedImage bi = ImageIO.read(new File(filepath));
			Image image = bi.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
			tag = new BufferedImage(100, 100, BufferedImage.TYPE_INT_BGR);
			Graphics g = tag.getGraphics();
			g.drawImage(image, 0, 0, null);
			g.dispose();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return tag;
	}
}
