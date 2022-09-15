import java.util.*;
public class NoofCharactersinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char c=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==c) {
				count+=1;
			}
		}
		System.out.println(count);
		}

}
