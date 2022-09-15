import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class FIleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("file.txt");
		try {
			if(f.createNewFile()) {
				System.out.println("File Created");
			}
			else {
				System.out.println("File Already Present");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
//		Writing Data
//		try {
//			FileOutputStream out=new FileOutputStream(f,true);
//			out.write(75);
//			
//			out.close();
//			System.out.println("File Written");
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
		
		
//		Reading Data
		try {
			FileInputStream fin=new FileInputStream(f);
			int num=fin.read();
			while(num!=-1) {
				System.out.print((char)num);
				num=fin.read();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
