package BasicPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int key=sc.nextInt();
		int start=0,end=a.length-1,mid=(start+end)/2;
		boolean flag=false;
		while(start<=end) {
			mid=(start+end)/2;
			if(key<a[mid]) {
				end=mid-1;
			}
			else if(key>a[mid]) {
				start=mid+1;
			}
			else {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("Key Found in Position "+(mid+1));
		}
		else {
			System.out.println("Key Not Found");
		}
	}

}
