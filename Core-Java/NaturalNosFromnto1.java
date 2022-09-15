import java.util.Scanner;

public class NaturalNosFromnto1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        do {
            System.out.print(" "+n--);
        } while (n>=1);
        System.out.println();
        for(int i=10;i>=1;i--)
            System.out.print(i+" ");
        System.out.println();
    }
}
