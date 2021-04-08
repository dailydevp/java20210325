package p06.lecture.p4method;

import java.util.Arrays;

public class MyClass7 {
	void method1(int i) {
		System.out.println("method1!!!");
	}
	
	void method2(int i, int j) {
		System.out.println("method2@@@");
	}
	
	//varargs 아규먼트 수가 다양하다
	void method3( int ... i) {
		System.out.println("method3###");
		System.out.println(i.length);
		System.out.println(Arrays.toString(i));
	}
	
	//다른 애들과 같이 쓸땐 int..i는 무조건 뒤에 와야함.
	void method4(double d, int ...i) {
		System.out.println("method4$$$");
	}
}
