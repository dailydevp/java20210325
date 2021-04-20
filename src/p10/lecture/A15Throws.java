package p10.lecture;

public class A15Throws {
	public static void main(String[] args) {
		System.out.println("프로그램 실행");
		method1();
		System.out.println("프로그램 종료");
	}
	
	public static void method1() {
		method2();
	}
	public static void method2() {
		method3();
	}
	public static void method3() {
		try {
			Class.forName("java.lang.Number");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
