import java.util.*;
public class Convertinguppertolowerandlowertoupper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char[] a=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			if(a[i]>=65 && a[i]<=90) {
				a[i]+=32;
				System.out.print(a[i]);
			}
			else if(a[i]>=97 && a[i]<=122) {
				a[i]-=32;
				System.out.print(a[i]);
			}
		}
	}

}
