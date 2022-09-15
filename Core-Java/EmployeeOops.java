class Oops
{
    private String name,loc,dep;
    private long cno;
    private int id;
    private double sal;
    Oops(int id,String name,long cno,double sal,String dep,String loc)
    {
        this(id,name,cno);
        this.sal=sal;
        this.dep=dep;
        this.loc=loc;
    }
    Oops(int id,String name,long cno)
    {
        this.id=id;
        this.name=name;
        this.cno=cno;
    }
    String getname()
    {
        return name;
    }
    String getloc()
    {
        return loc;
    }
    String getdep()
    {
        return dep;
    }
    long getcno()
    {
        return cno;
    }
    int getid()
    {
        return id;
    }
    double getsal()
    {
        return sal;
    }
    void setcno(long cno)
    {
        this.cno=cno;
    }
    void setloc(String loc)
    {
        this.loc=loc;
    }
    void setdep(String dep)
    {
        this.dep=dep;
    }
    void setsal(double sal)
    {
        this.sal=sal;
    }
    void Print()
    {
        System.out.println(id);
        System.out.println(name);
        System.out.println(cno);
        System.out.println(sal);
        System.out.println(dep);
        System.out.println(loc);
    }



}
public class EmployeeOops {
    public static void main(String[] args) {
        Oops o=new Oops(1, "Kotappa Y G", 9611828660L,1000000,"AI","Hubballi");
        o.Print();
        System.out.println("After Updation");
        o.setcno(8861255637L);
        o.setsal(1500000);
        o.setdep("Data Science");
        o.setloc("Dharwad");
        System.out.println(o.getid());
        System.out.println(o.getname());
        System.out.println(o.getcno());
        System.out.println(o.getsal());
        System.out.println(o.getdep());
        System.out.println(o.getloc());

    }
    
}
