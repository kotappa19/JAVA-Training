import java.util.*;
class Employee
{
    private String ename,city;
    private int eid;
    private long cno;
    Employee(int eid,String ename,long cno,String city)
    {
        this(eid, ename);
        this.cno=cno;
        this.city=city;
    }
    Employee(int eid,String ename)
    {
        this.eid=eid;
        this.ename=ename;
    }
    void setcno(long cno)
    {
        this.cno=cno;
    }
    void setcity(String city)
    {
        this.city=city;
    }
    int geteid()
    {
        return eid;
    }
    public String toString()
    {
        return "Employee ID: "+eid+"\nEmployee Name: "+ename+"\nEmployee Contact Number: "+cno+"\nEmployee City: "+city;
    }
}
class Company
{
    Employee e;
    Scanner sc=new Scanner(System.in);
    ArrayList<Employee> a1=new ArrayList<>();
    void AddEmployee()
    {
        System.out.println("Enter the Employee ID");
        int eid=sc.nextInt();
        for (Employee e : a1) {
            if(eid==e.geteid())
            {
                System.out.println("Employee Already Found");
                return;
            }
        }
        System.out.println("Enter the Employee Name");
        String ename=sc.next();
        System.out.println("Enter the Employee Contact Number");
        long cno=sc.nextLong();
        System.out.println("Enter the Employee City");
        String city=sc.next();
        e=new Employee(eid, ename, cno, city);
        a1.add(e);
        System.out.println("Employee Added Successfully");
    }
    void RemoveEmployee()
    {
        System.out.println("Enter the Employee ID");
        int eid=sc.nextInt();
        for (Employee e : a1) {
            if(eid==e.geteid())
            {
                a1.remove(e);
                System.out.println("Employee Removed Successfully");
                return;
            }
        }
        System.out.println("Employee Not Found");
    }
    void DisplayEmployee()
    {
        System.out.println("Enter the Employee ID");
        int eid=sc.nextInt();
        for (Employee e : a1) {
            if(eid==e.geteid())
            {
                System.out.println(e);
                return;
            }
        }
        System.out.println("Employee Not Found");
    }
    void UpdateEmployee()
    {
        System.out.println("Enter the Employee ID");
        int eid=sc.nextInt();
        for (Employee e : a1) {
            if(eid==e.geteid())
            {
                System.out.println("Enter the Employee Contact Number to Update");
                long cno=sc.nextLong();
                e.setcno(cno);
                System.out.println("Employee Contact Number Updated Successfully");
                System.out.println("Enter the Employee City to Update");
                String city=sc.next();
                e.setcity(city);
                System.out.println("Employee City updated Successfully");
                return;
            }
        }
        System.out.println("Employee Not Found");
    }
    void DisplayAll()
    {
        if(a1.size()==0)
        {
            System.out.println("No Employees Found");
            return;
        }
        for (Employee e : a1) {
            System.out.println(e);
        }
    }
}
public class CompanyDriver {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Company c=new Company();
        while(true)
        {
            System.out.println("1-Add Employee\n2-Remove Employee\n3-Display Employee\n4-Update Employee\n5-Display All Employees\n6-Exit\nEnter Your Choice");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:c.AddEmployee();
                break;
                case 2:c.RemoveEmployee();
                break;
                case 3:c.DisplayEmployee();
                break;
                case 4:c.UpdateEmployee();
                break;
                case 5:c.DisplayAll();
                break;
                case 6:System.exit(0);
                default:System.out.println("Enter a Valid Choice");
            }
        }
    }
    
}
