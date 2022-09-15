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
    String brand;
    double price;
    sim s;
    mob(String brand,double price)
    {
        this.brand=brand;
        this.price=price;
    }
    public void InsertSim(sim s)
    {
        if(this.s==null)
        {
            this.s=s;
            System.out.println("Sim Inserted SUccessfully");
        }
        else
            System.out.println("Sim is already Present");
    }
    public boolean RemoveSim()
    {
        if(this.s==null)
        {
            return false;
        }
        else
        {
            this.s=null;
            return true;
        }
    }
    void Print()
    {
        System.out.println("Mobile Details are");
        System.out.println("Mobile Brand\t"+brand);
        System.out.println("Mobile Price\t"+price);
        System.out.println("Sim Number\t"+s.sim);
        System.out.println("Sim colour\t"+s.color);
        System.out.println("Servie Provider\t"+s.sp);
    }
}
public class MobileAggregation {
    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the mobile brand");
        String brand=sc.next();
        System.out.println("Enter the Price");
        double price=sc.nextDouble();
        System.out.println("Enter the sim number");
        long sim=sc.nextLong();
        System.out.println("Enter the sim colour");
        String scolor=sc.next();
        System.out.println("Enter the Service Provider name");
        String sp=sc.next();
        mob m=new mob(brand,price);
        m.InsertSim(new sim(sim, scolor, sp));
        m.Print();
        if(m.RemoveSim())
        {
            System.out.println("Sim is Removed");
        }
        else
        {
            System.out.println("Sim is not Present");    
        }
        if(!m.RemoveSim())
            System.out.println("Sim is not Present");    
        
        m.InsertSim(new sim(8861255637L, "Blue", "jio"));
        m.Print();
        sc.close();
    }  
}
