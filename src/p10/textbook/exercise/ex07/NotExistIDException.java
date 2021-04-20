package p10.textbook.exercise.ex07;

public class NotExistIDException extends Exception {
	public NotExistIDException() {}
	public NotExistIDException(String message) {
//		System.out.println("아이디가 존재하지 않습니다.");
		super(message);
	}
}
