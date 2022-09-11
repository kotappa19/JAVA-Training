package Serialisation;

import java.io.Serializable;

public class Student implements Serializable {
	String sname;
	int age;
	public Student() {}
	public Student(String sname, int age) {
		this.sname = sname;
		this.age = age;
	}
	
}
