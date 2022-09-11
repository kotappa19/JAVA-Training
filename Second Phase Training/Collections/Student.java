package Collections;

public class Student {
	String sub;
	int marks;
	
	public Student() {}

	public Student(String sub, int marks) {
		this.sub = sub;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [sub=" + sub + ", marks=" + marks + "]";
	}
	
}
