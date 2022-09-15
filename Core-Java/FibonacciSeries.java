import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=0,y=1;
        System.out.print(x+" "+y);
        for(int i=2;i<n;i++){
            int z=x+y;
            x=y;
            y=z;
            System.out.print(" "+z);
        }
        System.out.println();
    }
}
