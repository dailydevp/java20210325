package p08.lecture.ex5;

public class A01TypeCasting {
	public static void main(String[] args) {
		Malamute d1 = new Malamute();
		d1.bark();
		d1.sit();
		d1.pull();
		
		Pet p1 = d1;
//		p1.bark(); //x
		p1.sit(); //o
//		p1.pull(); //x
		
		SledDog s1 = d1;
//		s1.bark();
//		s1.sit();
		s1.pull();
		
		KindaDog k1 = d1;
		k1.bark();
//		k1.sit();
//		k1.pull();
		
		Malamute d2 = (Malamute) k1;
		d2.bark();
		d2.sit();
		d2.pull();
		
		Wolf w1 = (Wolf) k1;
		w1.bark();
		
		System.out.println("프로그램 종료");
	}
}
