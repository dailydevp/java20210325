package p10.lecture;

public class A18ThrowsKeyword {
	public static void main(String[] args) {
		method1();
		
		try {
			method2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	private static void method1() {
		int i = 0;
				
				if (i==0) {
					throw new RuntimeException("i가 0입니다.");
				}
	}
	
	private static void method2() throws Exception {
		int i = 0;
		
		if(i==0) {
			throw new Exception();
		}
	}
}
