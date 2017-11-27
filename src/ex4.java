import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class F extends JFrame {
		private JFrame f = this;
        private JPanel p = new JPanel(); //객체생성
        public F(){
        	this.setTitle("test"); //타이틀
        	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임닫힐때프로그램종료
        	Thread th = new Thread(new runnable()); //thread객체생성
            this.setLocation(100, 100); //위치
            this.add(p); //객체추가
            this.setVisible(true); //보이기
            this.setSize(300, 300); //크기
            th.start(); //thread시작
        }

        class runnable implements Runnable {
        	public void run() {
        		while(true) {
        			try {
        				f.setLocation(90, 100); //프레임위치
        				Thread.sleep(1); //아주짧은시간내에깨어난다
        				f.setLocation(100, 100);
        			} catch(InterruptedException e){return;}
               }
           }
      }

}
public class ex4 {
        public static void main(String[] args) {
        	new F();
       }
}

