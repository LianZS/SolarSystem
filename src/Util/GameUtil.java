package Util;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageFilter;
import java.io.IOException;
/**
 * ��Ϸ�����г��õĹ����࣬����ͼƬ
 * @author Administrator
 *
 */
import java.net.URL;

import javax.imageio.ImageIO;

import java.awt.Image;

public class GameUtil {
	private GameUtil() {
		
	}
	//������һ��Ὣ���췽��˽��
	public static Image getImage(String path) {//����ͼƬ	
		return Toolkit.getDefaultToolkit().getImage(GameUtil.class.getClassLoader().getResource(path));

	}
}
