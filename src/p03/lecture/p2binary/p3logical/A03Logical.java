package p03.lecture.p2binary.p3logical;

public class A03Logical {
	
	public static void main(String[] args) {
		
	//and &&, & (논리곱)
	// or ||, | (논리합)
	//xor ^ (배타적 논리합)
	//not ! (단항연산자에서 살펴봄)

	//and &&, &
	//연산의 결과 boolean
	//양변이 모두 True일 때만 true, 나머지 모두 False
	System.out.println(true && true); //true
	System.out.println(true && false); //false
	System.out.println(false && true);//false
	System.out.println(false && false); //false
	
	System.out.println(true&true); //true
	System.out.println(true&false); // false
	System.out.println(false&true); //false
	System.out.println(false&false); //false
	
	//short circuit
	int i = 3;
	System.out.println(true && (i++) > 0); //true
	System.out.println(i);
	
	System.out.println(false && (i++) >0); //false
	System.out.println(i);
	
	System.out.println(false & (i++)>0); // false
	System.out.println(i);
	
	//or ||, |
	//양변이 false일 때만 false
	//나머지 모두 true
	System.out.println(true || true); //true
	System.out.println(true || false); //true
	System.out.println(false|| true); //true
	System.out.println(false|| false); //false
	
	System.out.println(true | true); //true
	System.out.println(true | false); //true
	System.out.println(false| true); //true
	System.out.println(false| false); //false
	
	System.out.println(true || (i++)>0); //true
	System.out.println(i);
	
	System.out.println(false || (i++>0)); //true
	System.out.println(i);
	
	System.out.println(true|(i++)>0); //true
	System.out.println(i);
	
	// xor ^ (exclusive or)
	//두 항의 값이 다를 때만 true;
	//두 항의 값이 같으면 false
	
	System.out.println("xor");
	System.out.println(true ^ true); // false
	System.out.println(true ^ false); // true
	System.out.println(false ^ true); //true
	System.out.println(false ^ false); // false
	
	}
}
