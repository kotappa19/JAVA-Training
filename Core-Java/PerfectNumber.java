import java.util.*;
public class PerfectNumber {
    static Boolean isPerfect(int n)
    {
        int sum=0;
        for(int i=1;i<n;i++)
            if(n%i==0)
                sum+=i;
        if(sum==n)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isPerfect(n))
            System.out.println(n+"  is a Perfect Number");
        else
            System.out.println(n+"  is not a Perfect Number");
        sc.close();
    }

}
