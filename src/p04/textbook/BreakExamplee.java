package p04.textbook;

public class BreakExamplee {
	public static void main(String[] args) {
		
		for(;true;) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			if (num==6) {
				break;
			}
		}
		
		System.out.println("프로그램 종료");
	}
}
