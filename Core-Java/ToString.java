class Employee
{
    String name="Kotappa";
    int id=2;
    double sal=1000000;
    public String toString()
    {
        return id+" "+name+" "+sal;
    }
}
public class ToString {
    public static void main(String[] args) {
        Employee e=new Employee();
        System.out.println(e);
        Employee e1=new Employee();
        System.out.println(e1);
    }
}
