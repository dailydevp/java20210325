package p12.textbook.exercise.ex02;

public class MusicRunnable extends Thread{ //implement Runnable도 ok
	@Override
	public void run() {
		for (int i=0; i<3; i++) {
			System.out.println("음악을 재생합니다.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		}
	}
}
