import java.util.*;
public class StringReverseUsingStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		StringBuilder rev=new StringBuilder();
		for(int i=str.length()-1;i>=0;i--) {
			rev.append(str.charAt(i));
		}
		System.out.println(rev);
	}

}
