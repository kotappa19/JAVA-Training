package Serialisation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BookDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b=new Book(10, "JAVA", "Kotappa", 10000);
		try {
			FileOutputStream fos=new FileOutputStream("book.txt");
			ObjectOutputStream out=new ObjectOutputStream(fos);
			out.writeObject(b);
			out.close();
			fos.close();
			System.out.println("Serialised Successfully");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis=new FileInputStream("book.txt");
			ObjectInputStream input=new ObjectInputStream(fis);
			Book book=(Book)input.readObject();
			System.out.println(book.bid+" "+book.bname+" "+book.aname+" "+book.price);
			input.close();
			fis.close();
			System.out.println("Deserialised Successfully");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
