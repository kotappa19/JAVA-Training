import java.util.*;
public class StringtoCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char[] a=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			System.out.println(a[i]);
		}
	}

}
