class skool
{
    String name="SBI",loc="Hubballi";
    int pin=580030,staff=100,cls=20;
    skool(String name,String loc,int pin,int staff,int cls)
    {
        this(name,loc,pin);
        this.staff=staff;
        this.cls=cls;
    }
    skool(String name,String loc,int pin)
    {
        this.name=name;
        this.loc=loc;
        this.pin=pin;
    }
}
public class School {
    public static void main(String[] args) {
        skool s=new skool("Vishwachetana School","Byahatti",580023,25,4);
        System.out.println("Details");
        System.out.println(s.name);
        System.out.println(s.loc);
        System.out.println(s.pin);
        System.out.println(s.staff);
        System.out.println(s.cls);
    }
}
