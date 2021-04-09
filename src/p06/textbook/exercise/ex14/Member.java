package p06.textbook.exercise.ex14;

public class Member {

	String name;
	String id;
	String password;
	int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Member(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	/*
	 * public Member(String n, String i, String p, int a) {
		name = n;
		id = i;
		password = p;
		age = a;
	}
	 */
	
}
