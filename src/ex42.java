import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

public class ex42 extends JLabel {
	private JLabel la = new JLabel("�������̺�"); //��ü����
	public class ex42(){
		setTitle("test"); //Ÿ��Ʋ
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�����Ӵ��������α׷�����
    	Container c = getContentPane();
    	Thread th = new Thread(new Trn(la)); //thread��ü����
        la.setLocation(100, 100); //��ġ
        c.add(la); //�߰�
        c.setVisible(true); //���̱�
        c.setSize(300, 300); //ũ��
        th.start(); //thread����
	}
	class Trn implements Runnable {
		public void run() {
			while(true) {
				try {
					la.setLocation(90, 100); //���̺���ġ
					Thread.sleep(1); //����ª���ð����������
					la.setLocation(100, 100);
				} catch(InterruptedException e){return;}
			}
		}
	}
	public static void main(String[] args) {
		new ex42();

	}
}



