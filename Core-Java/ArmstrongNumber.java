import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem=0,sum=0,temp=n,count=0,i=1,temp1=n,frem=1;
        while (n!=0) {
            count++;
            n/=10;
        }
        while (temp!=0) {
            rem=temp%10;
            i=1;
            while(i<=count)
            {
                frem*=rem;
                i++;
            }
            sum+=frem;
            frem=1;
            temp/=10;
        }
        if (temp1==sum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}
