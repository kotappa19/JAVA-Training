import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,prod=1,rem=0;
        while (n!=0) {
            rem=n%10;
            sum+=rem;
            prod*=rem;
            n/=10;
        }
        if (sum==prod) {
            System.out.println("Spy Number");
        } else {
            System.out.println("Not a Spy Number");
        }
    }
}
