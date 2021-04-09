package p06.lecture.p9encapsulation;

public class Computer {
	String cpu;
	private int ram; // 1보다 작으면 안됨
	
	public void setRam(int ram){
		if(ram <1 ) {
			System.out.println("입력할 수 없습니다.");
		}else {
		this.ram = ram;
		}
	}
	public int getRam() {
		return this ram;
	}
}
