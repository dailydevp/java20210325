package p13.lecture;
	//generic이 없던  시절 ...
public class A02Generic {
	public static void main(String[] args) {
		Generic2 g2 = new Generic2();
		g2.setO("java");
		String s = (String) g2.getO();
		System.out.println(s);
		
		g2.setO(22);
		Integer i = (Integer) g2.getO();
		System.out.println(i);
		
		g2.setO(3.14);
		Integer d = (Integer) g2.getO();
		System.out.println(d);
		
	}
}

class Generic2 {
	private Object o;
	
	public void setO(Object o) {
		this.o = o;
	}
	
	public Object getO() {
		return o;
	}
}
