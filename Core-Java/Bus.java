import java.util.*;
class Passanger
{
    String pname;
    int pcno;
    Passanger(String pname,int pcno)
    {
        this.pname=pname;
        this.pcno=pcno;
    }
}
class bs
{
    String busno,dest,pick;
    int seats;
    Passanger p;
    bs(String busno,String dest,String pick,int seats,Passanger p)
    {
        this.busno=busno;
        this.dest=dest;
        this.pick=pick;
        this.seats=seats;
        this.p=p;
    }
    void Print()
    {
        System.out.println("Bus Details\t");
        System.out.println("Bus Number:\t"+busno);
        System.out.println("Destination\t"+dest);
        System.out.println("Pick Up Point\t"+pick);
        System.out.println("Number of seats\t"+seats);
        System.out.println("Passanger name\t"+p.pname);
        System.out.println("Passanger number\t"+p.pcno);
    }
}
public class Bus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Bus number");
        String busno=sc.next();
        System.out.println("Enter the Destination");
        String dest=sc.next();
        System.out.println("Enter the Pick Up point");
        String pick=sc.next();
        System.out.println("Enter the number of seats");
        int seats=sc.nextInt();
        System.out.println("Enter the passanger name");
        String pname=sc.next();
        System.out.println("Enter the passanger number");
        int pcno=sc.nextInt();
        bs b=new bs(busno,dest,pick,seats,new Passanger(pname, pcno));
        b.Print();
        sc.close();
    }
}
