package p12.textbook.s120301;

public class calcThread extends Thread {
	public calcThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(int i = 0; i <2000000000; i++) {
			
		}
		System.out.println(getName());
	}
}
