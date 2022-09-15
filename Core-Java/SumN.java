import java.util.*;

public class SumN {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n-->0){
            sum += sc.nextInt();
            System.out.print(sum + "  ");
        }
        System.out.println();
    }
}
