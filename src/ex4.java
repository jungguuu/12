import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class F extends JFrame {
		private JFrame f = this;
        private JPanel p = new JPanel(); //��ü����
        public F(){
        	this.setTitle("test"); //Ÿ��Ʋ
        	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�����Ӵ��������α׷�����
        	Thread th = new Thread(new runnable()); //thread��ü����
            this.setLocation(100, 100); //��ġ
            this.add(p); //��ü�߰�
            this.setVisible(true); //���̱�
            this.setSize(300, 300); //ũ��
            th.start(); //thread����
        }

        class runnable implements Runnable {
        	public void run() {
        		while(true) {
        			try {
        				f.setLocation(90, 100); //��������ġ
        				Thread.sleep(1); //����ª���ð����������
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

