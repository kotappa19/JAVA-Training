class Stud
{
    String sname="Kotappa",city="Hubballi",schoolname="SBI";
    int sid=1;
    long cno=9611828660L;
    Stud(int sid,String sname,long cno,String schoolname,String city)
    {
        this(sid, sname, cno);
        // this.sid=sid;
        // this.sname=sname;
        // this.cno=cno;
        this.schoolname=schoolname;
        this.city=city;
    }
    Stud(int sid,String sname,long cno)
    {
        this.sid=sid;
        this.sname=sname;
        this.cno=cno;
    }
    
}
public class Student {
    public static void main(String[] args) {
        Stud s=new Stud(2,"Girija",8861255637L,"Govt School","Byahatti");
        System.out.println(s.sid);
        System.out.println(s.sname);
        System.out.println(s.cno);
        System.out.println(s.schoolname);
        System.out.println(s.city);
    }
    
}
