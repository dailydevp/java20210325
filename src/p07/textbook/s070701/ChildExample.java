package p07.textbook.s070701;

import p07.lecture.p3method_override.Parent;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
		parent.method2();
		parent.method3();
		
	}
}
