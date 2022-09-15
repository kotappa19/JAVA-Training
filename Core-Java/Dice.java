import java.util.*;
public class Dice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dice=sc.nextInt();
        switch(dice)
        {
            case 4:
            case 1:System.out.println("You have to Dance");
                    break;
            case 5:
            case 2:System.out.println("You have to sing");
                    break;
            case 6:
            case 3:System.out.println("You have to act");
                    break;
            default:System.out.println("Go home");
        }
        sc.close();
    }
}
