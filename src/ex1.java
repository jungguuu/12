import java.util.Scanner;

class TR implements Runnable {
	public void run() { //run�޼ҵ� �������̵�
		System.out.println("������ ���� ����");		
		for(int i=1; i<=10; i++)
			System.out.print(i + " ");
		System.out.println();
		System.out.println("������ ����");
	}
}
public class ex1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ƹ� Ű�� �Է�>> ");
		String s = scanner.next(); //�ƹ�Ű�� �Է¹���
		
		Thread th = new Thread(new TR()); //������ ��ü����
		th.start(); //���������
	}
}

