package p10.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class A17ThrowsPolymorphism {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void method1() throws Exception {
		Class.forName("java.lang.String");
		FileInputStream file = new FileInputStream("");
	}
}
