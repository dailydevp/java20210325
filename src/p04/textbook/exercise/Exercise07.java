package p04.textbook.exercise;

import java.io.IOException;
import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) throws IOException  {
		
		boolean run = true;
		
		int plus = 0;
		int minus = 0;
		int depositt = 0;
		int keyCode = 0 ;
		
		
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		keyCode = System.in.read();
				
		while(true) {
			if(keyCode !=13 && keyCode !=10) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			}
			
				
			
			if(keyCode == 49) {
				++plus;
				System.out.println("예금액>"+value);
			}else if(keyCode == 50) {
				--minus;
				System.out.println("출금>"+minus);
			}
			 else if(keyCode == 51) {
				System.out.println("잔고>"+depositt);
			}else if(keyCode == 52) {
				run = false;
			}
			
			
			
			System.out.println("프로그램 종료");
		}
		
	}
}
