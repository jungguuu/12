import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ex5 extends JFrame{
	public ex5() {
		setTitle("��� ����"); //Ÿ��Ʋ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�����Ӵ�����â�ݱ�
		gPanel p = new gPanel(); //�гΰ�ü����
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
			public void mousePressed(MouseEvent e) { //���콺�Է½��Ѿ˹߻�
			}
		});
	}
		public void run() {
			while(true) {
				try {sleep(20);} //20ms�ִ� ���
				catch(InterruptedException e) {}
			}
	}	
}