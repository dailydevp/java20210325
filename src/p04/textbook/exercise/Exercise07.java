package p04.textbook.exercise;

import java.io.IOException;
import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		
		boolean run = true;
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
				
		while(run) {
			
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			
			
			int value = scanner.nextInt();
			do (value) {
				System.out.println("예금액>");
				int input = scanner.nextInt();
				balance += input;
			}
			
			
		
					
			System.out.println("프로그램 종료");
			}
		}
}
		
	
