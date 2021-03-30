package p04.lecture;

public class A04IfSample {
	public static void main(String[] args) {
		
		int user = 3;
		int dice = (int)(Math.random()*6)+1;
		
		if(user == dice) {
			System.out.println("당첨되었습니다.");
		}else {
			System.out.println("다시 실행해보세요.");
		}
	}
}
