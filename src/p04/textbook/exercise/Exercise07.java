package p04.textbook.exercise;


import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) throws Exception {
		
		boolean run = true;
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
				
		while(run) {
			if(keyCode !=13 && keyCode !=10) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			}
			
			keyCode = System.in.read();
				
			
			if(keyCode == 49) {
				System.out.println("예금액>");
				int plus = scanner.nextInt();
				balance += plus;
			}else if(keyCode == 50) {
				System.out.println("출금>");
				int minus = scanner.nextInt();
				balance -= scanner.nextInt();
			}
			 else if(keyCode == 51) {
				System.out.println("잔고>"+balance);
			}else if(keyCode == 52) {
				run = false;
			}
			
			
			
			System.out.println("프로그램 종료");
		}
		
	}
}