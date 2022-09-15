class Employee {
    double sal=0;
    int empid=0;
    String ename=null;
    String dob=null;
    Employee(int empid,String ename,String dob,double sal)
    {
        this.empid=empid;
        this.ename=ename;
        this.dob=dob;
        this.sal=sal;
    }
    Employee()
    {
        this.empid=1;
        this.ename="Kotappa Y G";
        this.dob="19-02-2000";
        this.sal=1000000;
    }
    Employee(int empid,String dob,String ename)
    {
        this.empid=empid;
        this.dob=dob;
        this.ename=ename;
    }
    Employee(int empid,String ename)
    {
        this.empid=empid;
        this.ename=ename;
    }
}
public class EmpDetails
{
    public static void main(String[] args) {
        Employee e=new Employee(1, "12-02-2910","Kotappa Y G",2000);
        System.out.println(e.empid);
        System.out.println(e.dob);
        System.out.println(e.ename);
        System.out.println(e.sal);
    }
}
