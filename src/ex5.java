import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ex5 extends JFrame{
	public ex5() {
		setTitle("사격 게임"); //타이틀
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임닫으면창닫기
		gPanel p = new gPanel(); //패널객체생성
		setContentPane(p);
		setSize(300,300);
		setResizable(false);		
		setVisible(true);
	}	
	public static void main(String [] args) {
		new ex5();
	}
}
class gPanel extends JPanel {
	private JLabel b = new JLabel();
	
	public gPanel() {
		setLayout(null);
	
		this.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) { //마우스입력시총알발사
			}
		});
	}
		public void run() {
			while(true) {
				try {sleep(20);} //20ms있다 깨어남
				catch(InterruptedException e) {}
			}
	}	
}