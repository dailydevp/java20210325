package p06.lecture.p6final;

public class A01Final {
	static final int f;
	
	final static double PI = 3.1415;
	
	static {
		f = 55;
	}
	
	int a;
	final int b;
	
	A01Final(){
		this.b = 9;
	}
	
	public static void main(String[] args) {
		//final 변수(지역변수, 파라미터, 필드)는
		//값을 한 번만 할당 받을 수 있음
		
		final int i;
		int j;
		j = 3;
		j = 5;
		
		i = 9;
//		i = 10; //x
		
		
	}
	
	static void method(final int i) {
		System.out.println(i);
//		i = 3; // x
		
	}
}
