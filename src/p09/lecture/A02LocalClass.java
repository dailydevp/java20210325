package p09.lecture;

public class A02LocalClass {
	//non-static inner class 3 순위로 쓰임.
	class InnerClass {
		
	}
	//static nested class 2 
	static class NestedClass{
		
	}
	
	void method1() {
		//local class --메소드안에서만사용가능innerclass 필요한거가까이둬서쓸라고.1
		class LocalClass{
			//필드
			//생성자
			//메소드
		}
		LocalClass o1 = new LocalClass();
		
	}
}
