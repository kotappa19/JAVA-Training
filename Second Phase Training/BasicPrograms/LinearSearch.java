package BasicPrograms;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		boolean flag=false;
		int kindex=0;
		int key=sc.nextInt();
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				kindex=i;
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("Key Found at Position	"+(kindex+1));
		}
		else {
			System.out.println("Key not Found");
		}
	}

}
