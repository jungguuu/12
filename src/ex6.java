import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ex6 extends JFrame{
	public ex6() {
		setTitle("버블 게임"); //타이틀
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임닫으면창닫기
		JPanel p = new JPanel(); //패널객체생성
		setLayout(null);
		ImageIcon imgicon= new ImageIcon("image/apples.jpg"); //이미지 객체
		setContentPane(p);
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) { //마우스클릭시사진
				JLabel l = new JLabel(imgicon); 
                l.setSize(50, 50); //크기
                p.add(l);
                l.setLocation(e.getX(), e.getY()); //마우스클릭한 위치에 놓기

			}
		});
		setSize(300,300);
		setResizable(false);		
		setVisible(true);
	}	
	class tr implements Runnable {
		public void run(){
			while(true) {
				try { 
					setLocation(getX(), getY()+5); //위로 이동
					Thread.sleep(200);} //20ms마다 
				catch(InterruptedException e){return;}
			}
	        }
	}
	public static void main(String [] args) {
		new ex5();
	}
}









