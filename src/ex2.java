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
		Thread th = new Thread(this); //스레드 객체생성
		th.start(); //스레드시작
		}
	public void run() { //run메소드 오버라이딩
		while(true) { //400ms마다 픽셀 이동
			Random ran = new Random(); 
			x = ran.nextInt(400);
			y = ran.nextInt(400);
			repaint();
			try {Thread.sleep(delay);} //delay밀리초마다 잠을잔다
			catch(InterruptedException e) {return;}
		}
	} 
}
public class ex2 extends JFrame {
	private int x, y;
	public ex2 () {
		setTitle("패널랜덤위치");
		setSize(450, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel panel = new MyPanel();
		setContentPane(panel);
		setLayout(null); //컨텐트팬의 배치관리자 삭제
		addMouseListener(new MouseAdapter () { //Mouse리스너달기
			public void mousePressed (MouseEvent e) { //마우스를 클릭하자 실행 
				x = e.getX();
				y = e.getY();
				repaint();
		   }
		});
		setSize(50, 50); //크기
		setVisible(true); //보이기
		}
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) { //픽셀그리기
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
