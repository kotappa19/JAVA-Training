import java.util.*;
public class NoofDaysInMonth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Month=sc.nextInt();
        switch(Month)
        {
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            case 1:System.out.println("31");
                break;
            case 2:System.out.println("28/29");
                break;
            case 6:
            case 9:
            case 11:
            case 4:System.out.println("30");
                break;
            default:System.out.println("Enter valid Number");        
        }
        sc.close();
    }
}
