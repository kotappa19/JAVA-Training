import java.util.*;
public class ArrayDriver {
    Scanner sc=new Scanner(System.in);
    void IntArray()
    {
        int a[]=new int[5];
        for(int i=0;i<5;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<5;i++)
            System.out.print("\t"+a[i]);
    }
    void FloatArray()
    {
        float b[]=new float[5];
        for(int i=0;i<5;i++)
            b[i]=sc.nextFloat();
        for(int i=0;i<5;i++)
            System.out.print("\t"+b[i]);
    }
    void StringArray()
    {
        String s[]=new String[5];
        for(int i=0;i<5;i++)
            s[i]=sc.next();
        for(int i=0;i<5;i++)
            System.out.println("\t"+s[i]);
    }
    public static void main(String[] args) {
        ArrayDriver a=new ArrayDriver();
        System.out.println("\nInteger Array elements");
        a.IntArray();
        System.out.println("\nFLoating Array elements");
        a.FloatArray();
        System.out.println("\nString Array elements");
        a.StringArray();
    }
}
