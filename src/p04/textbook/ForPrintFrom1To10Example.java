package p04.textbook;

public class ForPrintFrom1To10Example {
	public static void main(String[] args) {
		for(int i = 1; i<=10; i++) {
			System.out.println(i);
		}
			
		//1~10 홀수만
//		 for(int i=1; i<6; i++) {
//			System.out.println(2*i-1);
//			}
		//1~10 짝수만
//		for(int a=1; a<6; a++) {
//			System.out.println(2*a);
		}
		//10~1
//		for(int b=10; b>=1; b--) {
//			System.out.println(b);
//		}
		//10~1 짝수만
//		for(int c=5; c>0; c--) {
//			System.out.println(2*c);
//		}
		//10~1 홀수만
//		for(int d=5; d>0; d--) {
//			System.out.println(2*d-1);
//			}
	
	// 1~10 홀수만
	System.out.println("1~10 홀수만");
	for(int i = 1; i <= 10; i += 2) {
		System.out.println(i);
	}
	// 1~10 짝수만
	System.out.println("1~10 짝수만");
	for (int i = 2; i <= 10; i += 2) {
		System.out.println(i);
	}
	
	// 10~1
	System.out.println("10~1");
	for (int i = 10; i >= 1; i--) {
		System.out.println(i);
	}
	// 10~1 짝수만
	System.out.println("10~1 짝수만");
	for (int i = 10; i >= 1; i -= 2) {
		System.out.println(i);
	}
	
	// 10~1 홀수만
	System.out.println("10~1 홀수만");
	for (int i = 9; i >= 1; i -= 2) {
		System.out.println(i);
		}
	}
}

	

	
