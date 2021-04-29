package p15.textbook.exercise.ex08;

public class Student {
	public int studentNum;
	public String name;
	
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime*result + studentNum;
		return result;
		
//		return studentNum + name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
	
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if(studentNum != other.studentNum)
			return false;
		return true;
		
	/*
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return (studentNum == student.studentNum) && (name.equals(student.name));
	}else {
		return false;
	*/
	
	}
}
