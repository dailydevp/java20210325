package p06.lecture.p4method;

public class MyClass1 {
	
		//fields
		int age;
		String name;
		
		//constructors
		MyClass1(){
			
		}
		MyClass1(String name){
			this.name = name;
		}
		//methods
		/*
		리턴타입 메소드명(파라미터 리스트){
			실행될 명령문들 ...
		}
		*/
		//메소드명 : $, _, 영문대소문자, 숫자조합
		//           숫자가 맨 앞에 오면 안됨
		//작명관습 : lowerCamelCase
		
		//파라미터 목록 : [타입 명], [타입 명]
		//                  0개이상 작성가능 (작성안해도 오케이)
		
		//리턴타입 :메소드가 반환해야 하는 값의 타입
		//         void일 경우 반환하지 않아도 
		
		
		void method1(String param1, int param2){
			//statements ...
			System.out.println("method1 호출~~~~~");
		}
		
		int method2() {
			System.out.println("method2 호출!!!!!");
			return 3;
		}
}
