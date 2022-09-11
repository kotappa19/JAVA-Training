import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=n;i<=m;i++)
        {
            Boolean flag=true;
            for(int j=2;j<i;j++)
            {
                if (i%j==0) 
                    flag=false;   
            }
            if(flag)
            {
                System.out.print(i+" ");
            }
        }
    }
}
