import java.util.*;
public class StringShifting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int n=sc.nextInt();
		for(int i=n;i<str.length();i++) {
			System.out.print(str.charAt(i));
		}
		for(int i=0;i<n;i++) {
			System.out.print(str.charAt(i));
		}
	}

}
