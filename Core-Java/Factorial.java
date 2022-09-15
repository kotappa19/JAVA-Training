import java.util.*;
public class Factorial {
    static int Fact(int n)
    {
        int fact=1;
        for(int i=n;i>0;i--)
            fact=fact*i;
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Fact(n));
        sc.close();
    }
}
