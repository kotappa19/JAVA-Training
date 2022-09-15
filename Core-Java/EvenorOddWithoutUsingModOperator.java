import java.util.*;
public class EvenorOddWithoutUsingModOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=(n/2)*2;
		if(temp==n) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}

}
