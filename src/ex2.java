import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.*;

class ThreadR extends JFrame implements Runnable {
	private long delay;
	private int x, y;
	public ThreadR(long delay) {
		this.delay = delay;
		Thread th = new Thread(this); //������ ��ü����
		th.start(); //���������
		}
	public void run() { //run�޼ҵ� �������̵�
		while(true) { //400ms���� �ȼ� �̵�
			Random ran = new Random(); 
			x = ran.nextInt(400);
			y = ran.nextInt(400);
			repaint();
			try {Thread.sleep(delay);} //delay�и��ʸ��� �����ܴ�
			catch(InterruptedException e) {return;}
		}
	} 
}
public class ex2 extends JFrame {
	private int x, y;
	public ex2 () {
		setTitle("�гη�����ġ");
		setSize(450, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel panel = new MyPanel();
		setContentPane(panel);
		setLayout(null); //����Ʈ���� ��ġ������ ����
		addMouseListener(new MouseAdapter () { //Mouse�����ʴޱ�
			public void mousePressed (MouseEvent e) { //���콺�� Ŭ������ ���� 
				x = e.getX();
				y = e.getY();
				repaint();
		   }
		});
		setSize(50, 50); //ũ��
		setVisible(true); //���̱�
		}
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) { //�ȼ��׸���
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawOval(x, y, 50, 50);
			}
		}
	public static void main(String[] args) {
		new ex2();
		ThreadR t = new ThreadR(400);
	}
}
