import java.util.*;
class Cab
{
    private int cabno;
    Cab(int cabno)
    {
        this.cabno=cabno;
    }
    int getcabno()
    {
        return cabno;
    }
    void setcabno(int cabno)
    {
        this.cabno=cabno;
    }
}
class Prime extends Cab
{
    Prime(int cabno)
    {
        super(cabno);
    }
    int price=300;
}
class Mini extends Cab
{
    Mini(int cabno)
    {
        super(cabno);
    }
    int price=200;
}
class Micro extends Cab
{
    Micro(int cabno)
    {
        super(cabno);
    }
    int price=100;
}
class Ola
{
    Cab c;
    void BookCab(Cab c)
    {
        if(this.c!=null)
            System.out.println("Cab is Already Booked");
        else
        {
            this.c=c;
            System.out.println("Cab is Booked Successfully");
        }
    }
    void CancelCab()
    {
        if(this.c==null)
            System.out.println("Cab is not Booked Yet");
        else
        {
            if(c instanceof Prime)
            {
                c=null;
                System.out.println("Prime Cab is Booking is Cancelled");
            }
            else if(c instanceof Mini)
            {
                c=null;
                System.out.println("Mini Cab is Booking is Cancelled");
            }
            else if(c instanceof Micro)
            {
                c=null;
                System.out.println("Micro Cab is Booking is Cancelled");
            }
        }
    }
    void CheckCabBooking()
    {
        if(this.c==null)
            System.out.println("No Cab is Booked Yet");
        else
        {
            if(c instanceof Prime)
                System.out.println("Prime Cab Booking is there");
            else if(c instanceof Mini)
                System.out.println("Mini Cab Booking is there");
            else if(c instanceof Micro)
                System.out.println("Micro Cab booking is there");
        }
    }
    void ShowCab()
    {
        if(this.c==null)
            System.out.println("No Cab is Booked Yet");
        else
        {
            if(c instanceof Prime)
                System.out.println("Prime Cab Booking is Available");
            else if(c instanceof Mini)
                System.out.println("Mini Cab is Available");
            else if(c instanceof Micro)
                System.out.println("Micro Cab is Available");
        }
    }
}
public class OlaCab {
    public static void main(String[] args) {
        Ola o=new Ola();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("1-Book Cab\n2-Cancel Booking\n3-Check Cab Booking\n4-Show Cab\n5-Exit\nEnter Your Choice");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:System.out.println("1-Book Prime Cab\n2-Book Mini Cab\n3-Book Micro Cab");
                    int c=sc.nextInt();
                    if(c==1)
                    {
                        o.BookCab(new Prime(10));
                    }
                    else if(c==2)
                    {
                        o.BookCab(new Mini(20));
                    }
                    else if(c==3)
                    {
                        o.BookCab(new Micro(30));
                    }
                    break;
                case 2:o.CancelCab();
                break;
                case 3:o.CheckCabBooking();
                break;
                case 4:o.ShowCab();
                break;
                case 5:System.exit(0);
                default:System.out.println("Enter the valid choice");
            }
        }

    }
}
