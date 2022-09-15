import java.util.*;
public class Smallestof3 {
    static int smallest(int x,int y,int z)
    {
        if(x<y && x<z)
            return x;
        else if(y<z)
            return y;
        else
            return z;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        System.out.println(smallest(x,y,z));
        sc.close();

    }
}
