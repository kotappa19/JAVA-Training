import java.util.*;
class student
{
    int sid;
    String sname,nat;
    long cno;
    student(int sid,String sname,long cno,String nat)
    {
        this.sid=sid;
        this.sname=sname;
        this.cno=cno;
        this.nat=nat;
    }
}
class hos
{
    String name,loc,oname;
    int pin;
    student s;
    hos(String name,String loc,String oname,int pin,student s)
    {
        this.name=name;
        this.loc=loc;
        this.oname=oname;
        this.pin=pin;
        this.s=s;
    }
    void Print()
    {
        System.out.println("Student Details are");
        System.out.println(s.sid);
        System.out.println(s.sname);
        System.out.println(s.cno);
        System.out.println(s.nat);
        System.out.println(name);
        System.out.println(loc);
        System.out.println(oname);
        System.out.println(pin);
    }
}
public class Hostel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the hostel name");
        String name=sc.next();
        System.out.println("Enter the hostel location");
        String loc=sc.next();
        System.out.println("Enter the hostel owner name");
        String oname=sc.next();
        System.out.println("Enter the Pin Code");
        int pin=sc.nextInt();
        System.out.println("Enter the student id");
        int sid=sc.nextInt();
        System.out.println("Enter the student name");
        sc.nextLine();
        String sname=sc.nextLine();
        System.out.println("Enter the contact number");
        long cno=sc.nextLong();
        System.out.println("Enter the native place");
        String nat=sc.next();
        hos h=new hos(name,loc,oname,pin,new student(sid, sname,cno,nat));
        h.Print();
        sc.close();
    }
    
}

