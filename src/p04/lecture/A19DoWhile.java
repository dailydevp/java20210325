package p04.lecture;

public class A19DoWhile {
	public static void main(String[] args) {
		boolean a = false;
		while(a) {
			System.out.println("while code block");
		}
		
		//do while(); : code block이 최초 한번은 실행딤.
		//               이후 조건이 true -->code block
		//                           false -->다음 실행 흐름.
		
		do {
			System.out.println("do while code block");
		} while (a);
		
		System.out.println("프로그램 종료...");
	}
}
