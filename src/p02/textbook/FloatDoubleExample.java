package p02.textbook;

public class FloatDoubleExample {
	public static void main(String[] args) {
		//실수값 저장
		double var1 = 3.14;
		//float var2 = 3.14; //컴파일에러 (Type mistmatch)
		float var2 = 3.14F;
		
		//정밀도 테스트
		double var4 = 0.1234567890123456789;
		float var5=0.1234567890123456789F;
		
		System.out.println("var1:"+var1);
	}
}
