package p03.textbook;

public class OverflowExample {
	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x*y;
		System.out.println(z);
		//오버플로우 해결책
		long s = 1000000;
		long d = 1000000;
		long f = s*d;
		System.out.println(f);
	}
}


