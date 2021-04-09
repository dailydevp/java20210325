package p04.textbook.exercise;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		
		boolean run = true;
		int balance = 0;
		
		int plus = 0;
		int minus = 0;
		
		Scanner scanner = new Scanner(System.in);
				
		while(run) {
			
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			
			int value = scanner.nextInt();
			if(value ==1) {
				value = scanner.nextInt();
				balance += value;
				System.out.println("예금액>"+balance);
			}else if(value == 2) {
				value = scanner.nextInt();
				minus += value;
				System.out.println("출금액>"+minus);
			}else if(value ==3) {
				
				balance -= minus;
				System.out.println("잔고>"+balance);
			}else {
				break;
			}

			}
					
			System.out.println("프로그램 종료");
			}
		}

		
	
