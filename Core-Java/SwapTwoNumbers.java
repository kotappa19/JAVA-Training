package BasicPrograms;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);
	}

}
