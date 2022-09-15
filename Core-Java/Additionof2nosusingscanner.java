import java.util.Scanner;

public class Additionof2nosusingscanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println(c);
        System.out.println("Enter the character");
        char ch=sc.next().charAt(0);
        System.out.println("Enter the string");
        String str=sc.next();
        System.out.println(ch+" "+str);

    }
}
