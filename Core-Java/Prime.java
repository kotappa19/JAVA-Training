import java.util.*;
public class Prime {

    static Boolean isPrime(int n)
    {
        int flag=0;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isPrime(n))
            System.out.println(n+"  is a Prime Number");
        else
            System.out.println(n+"  is not a Prime Number");
            sc.close();
    }
}
