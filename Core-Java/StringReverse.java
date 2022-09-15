import java.util.*;
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char[] a=new char[str.length()];
		int j=0;
		for(int i=str.length()-1;i>=0;i--) {
			a[j++]=str.charAt(i);
		}
		for(int i=0;i<str.length();i++) {
			System.out.print(a[i]);
		}
	}

}
