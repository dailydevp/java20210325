package p04.lecture;

public class A04IfSample {
	public static void main(String[] args) {
		
		int user = 3;
		int dice = (int)(Math.random()*6)+1; // 1~6 임의의 
		
		//만약 User와 dice가 같으면 
		//"당첨되었습니다." 메세지 출력
		//그렇지 않으면
		//"다시 실행해보세요." 메세지 출력
		
		if(user == dice) {
			System.out.println("당첨되었습니다.");
		}else {
			System.out.println("다시 실행해보세요.");
		}
	}
}
