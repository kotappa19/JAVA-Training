package WrapperClass;

public class WrapperClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		Integer obj=i;
		Integer obj1=new Integer(20);
		int j=(int)obj1;
		System.out.println("Integer Values  "+obj+" "+j);
		char c='k';
		Character ch=c;
		Character ch1=new Character('g');
		char c1=(char)ch1;
		System.out.println("Character Values  "+ch+" "+c1);
		boolean b=false;
		Boolean bool=b;
		Boolean b1=new Boolean(true);
		boolean b2=(boolean)b1;
		System.out.println("Boolean Values  "+bool+" "+b2);
	}

}
