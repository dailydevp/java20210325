package p13.textbook.exercises.ex04;

public class UtilExample {
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("홍길동",35);
		Integer age = Util.getValue(pair, "홍길동");
		System.out.println(age);
	}
}
