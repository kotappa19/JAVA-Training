import java.util.*;
class Student
{
    private String sname,email;
    long cno;
    Student(String sname,String email,long cno)
    {
        this.sname=sname;
        this.email=email;
        this.cno=cno;
    }
    String getsname()
    {
        return sname;
    }
    String getemail()
    {
        return email;
    }
    long getcno()
    {
        return cno;
    }
    void setemail(String email)
    {
        this.email=email;
    }
    void setcno(long cno)
    {
        this.cno=cno;
    }
}
class College
{
    private String loc;
    Student s;
    College(String loc)
    {
        this.loc=loc;
    }
    String getloc()
    {
        return loc;
    }
    void GetAdmission(Student s)
    {
        if(this.s!=null)
            System.out.println("Seats are full");
        else
        {
            this.s=s;
            System.out.println("Student Admitted Successfully");
        }
    }
    void RemoveStudent()
    {
        if(this.s==null)
            System.out.println("No Students are there");
        else
        {
            this.s=null;
            System.out.println("Student was removed successfully");
        }
    }
    void UpdateDetails()
    {
        if(this.s==null)
            System.out.println("No Students are there");
        else
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the student email to update");
            String email=sc.next();
            s.setemail(email);
            System.out.println("Enter the student contact number to update");
            long cno=sc.nextLong();
            s.setcno(cno);
            System.out.println("Student Details updated Successfully");
        }
    }
    void Display()
    {
        if(this.s==null)
            System.out.println("No Students are there");
        else
        {
            System.out.println("Student name is\t"+s.getsname());
            System.out.println("Student email is\t"+s.getemail());
            System.out.println("Student contact number is\t"+s.getcno());
            System.out.println("College Location is\t"+loc);
        }
    }

}
public class StudentAggregation {
    public static void main(String[] args) {
        College c=new College("Hubballi");
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("1-Get Admission\n2-Remove Student\n3-Update Student Details\n4-Display Student Details\n5-exit");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:System.out.println("Enter the Student name");
                        String sname=sc.next();
                        System.out.println("Enter the Student email");
                        String email=sc.next();
                        System.out.println("Enter the Student contact number");
                        long cno=sc.nextLong();
                        c.GetAdmission(new Student(sname, email, cno));
                        break;
                case 2:c.RemoveStudent();
                        break;
                case 3:c.UpdateDetails();
                        break;
                case 4:c.Display();
                        break;
                case 5:System.exit(0);
                default:System.out.println("Enter the valid choice");
            }
        }
    }
}
