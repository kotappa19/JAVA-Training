package Collections;

import java.util.ArrayList;
import java.util.Iterator;


public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> obj=new ArrayList<Student>();
		Student s=new Student("java",20);
		Student s1=new Student("HTML", 32);
		Student s2=new Student("CSS",12);
		Student s3=new Student("JS", 20);
		obj.add(s);
		obj.add(s1);
		obj.add(s2);
		obj.add(s3);
		System.out.println(obj);
		Iterator<Student> it=obj.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
