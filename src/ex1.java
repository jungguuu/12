import java.util.Scanner;

class TR implements Runnable {
	public void run() { //run메소드 오버라이딩
		System.out.println("스레드 실행 시작");		
		for(int i=1; i<=10; i++)
			System.out.print(i + " ");
		System.out.println();
		System.out.println("스레드 종료");
	}
}
public class ex1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("아무 키나 입력>> ");
		String s = scanner.next(); //아무키나 입력받음
		
		Thread th = new Thread(new TR()); //스레드 객체생성
		th.start(); //스레드시작
	}
}

