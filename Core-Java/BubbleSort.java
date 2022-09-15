package BasicPrograms;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
