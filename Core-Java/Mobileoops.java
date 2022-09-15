import java.util.*;
class sim
{
    long sim;
    String color,sp;
    sim(long sim,String color,String sp)
    {
        this.sim=sim;
        this.color=color;
        this.sp=sp;
    }
}
class mob
{
    String brand,color,memory;
    double price;
    sim s;
    mob(String brand,String color,String memory,double price,sim s)
    {
        this.brand=brand;
        this.color=color;
        this.memory=memory;
        this.price=price;
        this.s=s;
    }
    void Print()
    {
        System.out.println("Mobile Details are");
        System.out.println(brand);
        System.out.println(color);
        System.out.println(memory);
        System.out.println(price);
        System.out.println(s.sim);
        System.out.println(s.color);
        System.out.println(s.sp);
    }
}
public class Mobileoops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the mobile brand");
        String brand=sc.next();
        System.out.println("Enter the mobile colour");
        String mcolor=sc.next();
        System.out.println("Enter the Internal Storage space");
        String memory=sc.next();
        System.out.println("Enter the Price");
        double price=sc.nextDouble();
        System.out.println("Enter the sim number");
        long sim=sc.nextLong();
        System.out.println("Enter the sim colour");
        String scolor=sc.next();
        System.out.println("Enter the Service Provider name");
        String sp=sc.next();
        mob m=new mob(brand,mcolor,memory,price,new sim(sim, scolor, sp));
        m.Print();
        sc.close();
    }
    
}
