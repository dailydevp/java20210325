package p04.textbook;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		for(int m=2;m<=9;m++) {
			System.out.println("***"+m+"단***");
			for ( int n =1; n<=9; n++) {
				System.out.println(m+"x"+n+"="+(m*n));
			}
		}
		
		
		//2단 ~9단 짝수단
		
		for (int a =2; a<=9;a+=2) {
			System.out.println("###"+a+"단###");
			for (int b=1; b<=9; b++) {
				System.out.println(a+"x"+b+"="+(a*b));
			}
		}
		
		//2단 ~9단 *짝수
		
		for (int a=2; a<=9; a+=2) {
			System.out.println("***"+a+"단***");
			for(int b=2; b<=8; b+=2) {
			System.out.println(a+"x"+b+"="+(a*b));
		}
	}
		
		//9단 ~2단 (9*1~9*9, ~ 2*1~2*9)
		for (int c = 9; c>=2;c--) {
			System.out.println("###"+c+"단###");
			for(int b=1;b<=9; b++) {
			System.out.println(c + "x" + b + "=" + (c*b));
			}
		}
		
		
		//9단 ~ 2단 (9*9 ~ 9*1, 2*9~2*1)
		for(int q=9;q>=2;q--) {
			System.out.println("***"+q+"단***");
			for(int e=9;e>=1;e--) {
				System.out.println(q+"x"+e+"="+(q*e));
				}
			}
	}
}

	

