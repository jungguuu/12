import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ex6 extends JFrame{
	public ex6() {
		setTitle("���� ����"); //Ÿ��Ʋ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�����Ӵ�����â�ݱ�
		JPanel p = new JPanel(); //�гΰ�ü����
		setLayout(null);
		ImageIcon imgicon= new ImageIcon("image/apples.jpg"); //�̹��� ��ü
		setContentPane(p);
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) { //���콺Ŭ���û���
				JLabel l = new JLabel(imgicon); 
                l.setSize(50, 50); //ũ��
                p.add(l);
                l.setLocation(e.getX(), e.getY()); //���콺Ŭ���� ��ġ�� ����

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
					setLocation(getX(), getY()+5); //���� �̵�
					Thread.sleep(200);} //20ms���� 
				catch(InterruptedException e){return;}
			}
	        }
	}
	public static void main(String [] args) {
		new ex5();
	}
}









