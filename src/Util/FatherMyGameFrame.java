package Util;


import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/**
 * 
 * ��Ϸ����
 * @author Administrator
 *
 */
public class FatherMyGameFrame  extends Frame{
 
	
public void  launchFrame() {
		
		setSize(Contant.GAME_WIDTH, Contant.GAME_HEIGTHT);
		setLocation(100, 100);
		setTitle("����ʤ����");
		setVisible(true);
	new PaintThread().start(); //�����ػ��߳�
		addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			//���ÿɹرմ���
			
		});
		
	}
/**
 * �ػ����ڵ��߳��࣬��һ���ڲ���
 * @author Administrator
 *
 */
class PaintThread extends Thread{
	
	public void run() {
		while(true) {//cʹ�ó���ʱ��Ҫ�������У�������Ҫ��ѭ��
			update(getGraphics());//�ػ�����
			//repaint();//repaint��ʹ������˸�����ػ�����
			try {
				Thread.sleep(100);//�ӳ�0.05��
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
}
