import java.util.ArrayList;
import java.util.Scanner;

class Course
{
    private String cname;
    private double fees;
    private int id;
    Course(int id,String cname,double fees)
    {
        this(id,cname);
        this.fees=fees;
    }
    Course(int id,String cname)
    {
        this.id=id;
        this.cname=cname;
    }
    int getid()
    {
        return id;
    }
    void setfees()
    {
        this.fees=fees;
    }
    public String toString()
    {
        return "Course ID:\t"+id+"\nCourse Name:\t"+cname+"\nCourse Fees:\t"+fees;
    }
}
class MyException extends Exception
{
    public MyException(String s)
    {
        super(s);
    }
}
class College
{
    Course c;
    Scanner sc=new Scanner(System.in);
    ArrayList<Course> a1=new ArrayList<>();
    void AddCourse()
    {
        System.out.println("Enter the Course ID");
        int id=sc.nextInt();
        for (Course c : a1) {
            if(id==c.getid())
            {
                System.out.println("Course Already Found");
                return;
            }
        }
        System.out.println("Enter the Course Name");
        String cname=sc.next();
        System.out.println("Enter the Course Fees");
        double fees=sc.nextDouble();
        c=new Course(id, cname, fees);
        a1.add(c);
        System.out.println("Course Added Successfully");
    }
    void RemoveCourse()
    {
        System.out.println("Enter the Course ID");
        int id=sc.nextInt();
        for (Course c : a1) {
            if(id==c.getid())
            {
                a1.remove(c);
                System.out.println("Course Removed Successfully");
                return;
            }
        }
        System.out.println("Course not Found");
    }
    void UpdateCourse()
    {
        
    }
}
public class CourseDriver {
    
}
