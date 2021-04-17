package p09.lecture;

public class A06AnonymousClass {
	public static void main(String[] args) {
		int localVar = 3;
		
//		localVar = 4;
		
//		args = new String[] {}; final처럼 쓰거나 Final을 명시하던가.
		
		MyInterface i1 = new MyInterface() {
			void method() {
				System.out.println(localVar);
				System.out.println(args);
			}
		};
		
	}
}
