import java.util.Scanner;

public class LeapYear {
    static Boolean isLeapYear(int year)
    {
        if((year%4==0 && year%400==0) || year%100!=0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(isLeapYear(year))
            System.out.println(year+" is a Leap Year");
        else
            System.out.println(year+" is not a Leap Year");
        sc.close();
    }
}
