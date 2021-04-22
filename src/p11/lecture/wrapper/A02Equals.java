package p11.lecture.wrapper;

public class A02Equals {
	public static void main(String[] args) {
		Integer i1 = 999999999; // 참조 . 참조타입 비교할 때 주의.
		Integer i2 = new Integer(999999999);
		
		int int1 = i1; //기본
		int int2 = i2;
		
		System.out.println(int1 == int2);
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
	}
}
