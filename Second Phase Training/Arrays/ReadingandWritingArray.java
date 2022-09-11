package Arrays;

import java.util.Scanner;

public class ReadingandWritingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
		int i=0,j=a.length-1,temp=0;
		while(i<=j) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
		}
		for(int k=0;k<a.length;k++) {
			System.out.println(a[k]);
		}
		
	}

}
