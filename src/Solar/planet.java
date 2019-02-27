package Solar;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.security.GeneralSecurityException;
import Util.GameUtil;
public class planet  extends star{
	//����ͼƬ�����꣬��������ĳ����Բ���У����ᣬ���ᣬ�ٶȣ��Ƕ���ĳ��Star��
	double longAxis;
	double shortAxis;
	double speed;
	double degree;
	 star center;
	 boolean a;
	public planet(star center,String imgpath,  double longAxis, double shortAxis,
			double speed,boolean a) {	
		this.img=GameUtil.getImage(imgpath);
		this.longAxis = longAxis;
		this.shortAxis = shortAxis;
		this.speed = speed;
		this.center = center;
		this.x=center.x+longAxis;
		this.y=center.y+shortAxis;
		this.a=a;
	}
 public void draw(Graphics g) {
	super.draw(g);
	move();
	if(a==true)//���ǵĻ��Ͳ��û���Բ
	drawTrace(g);
 }
 //����Բ
 public void drawTrace(Graphics g) {
	 double _x,_y,_width,_height;
	 _width=longAxis*2;
	 _height=shortAxis*2;
	 _x=center.x-longAxis+center.width/2;
	 _y=center.y-shortAxis+center.height/2;
	g.setColor(Color.BLUE);
	g.drawOval((int )_x, (int )_y, (int )_width, (int )_height);
 }
 public void move() {
	 //��Բ����
	 x=center.x+center.width/2+longAxis*Math.cos(degree);
	 y=center.y+center.height/2+shortAxis*Math.sin(degree);
	 degree+=speed;
 }
}
