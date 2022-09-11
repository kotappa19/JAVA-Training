import java.net.http.WebSocketHandshakeException;
import java.util.Scanner;

public class EvenDigitsofGivenNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while (n!=0) {
            int rem=n%10;
            if(rem%2==0)
                sum+=rem;
            n/=10;
        }
        System.out.println(sum);
    }
}
