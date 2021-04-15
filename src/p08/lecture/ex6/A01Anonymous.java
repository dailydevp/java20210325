package p08.lecture.ex6;

public class A01Anonymous {
	public static void main(String[] args) {
		MyInterface i1;
		i1 = new MyClass();
		
		// 클래스와 인스턴스를 한번에 만듦.
		// 무명클래스 (anonymous class) , 익명클래스
		
		MyInterface i2;
		i2 = new MyInterface() {
			@Override
			public void method1() {
				System.out.println("anonymous class");	
			}
		};
		
		i1.method1();
		i2.method1();
	}
}
