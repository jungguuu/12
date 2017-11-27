import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

public class ex42 extends JLabel {
	private JLabel la = new JLabel("진동레이블"); //객체생성
	public class ex42(){
		setTitle("test"); //타이틀
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임닫힐때프로그램종료
    	Container c = getContentPane();
    	Thread th = new Thread(new Trn(la)); //thread객체생성
        la.setLocation(100, 100); //위치
        c.add(la); //추가
        c.setVisible(true); //보이기
        c.setSize(300, 300); //크기
        th.start(); //thread시작
	}
	class Trn implements Runnable {
		public void run() {
			while(true) {
				try {
					la.setLocation(90, 100); //레이블위치
					Thread.sleep(1); //아주짧은시간내에깨어난다
					la.setLocation(100, 100);
				} catch(InterruptedException e){return;}
			}
		}
	}
	public static void main(String[] args) {
		new ex42();

	}
}



