package Serialisation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Serialisation
		Student s=new Student("Appu", 45);
		try {
			FileOutputStream fos=new FileOutputStream("file.txt");
			ObjectOutputStream out=new ObjectOutputStream(fos);
			out.writeObject(s);
			out.close();
			fos.close();
			System.out.println("Serialised Successfully");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
//		Deserialisation
		try {
			FileInputStream fis=new FileInputStream("file.txt");
			ObjectInputStream input=new ObjectInputStream(fis);
			Student st=(Student)input.readObject();
			System.out.println(st.sname);
			System.out.println(st.age);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
