package p10.textbook.exercise.ex07;

public class WrongPasswordException extends Exception{
	public WrongPasswordException() {}
	public WrongPasswordException (String message) {
//		System.out.println("패스워드가 틀립니다.");
		super(message);
	}
}
