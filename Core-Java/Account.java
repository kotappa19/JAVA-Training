class ac
{
    private String pswd,name,city,bob;
    private long acc;
    ac(long acc,String pswd,String name,String city,String bob)
    {
        this(acc,pswd,name);
        this.city=city;
        this.bob=bob;
    }
    ac(long acc,String pswd,String name)
    {
        this.acc=acc;
        this.pswd=pswd;
        this.name=name;
    }
    long getacc()
    {
        return acc;
    }
    String getname()
    {
        return name;
    }
    String getcity()
    {
        return city;
    }
    String getbob()
    {
        return bob;
    }
    void setpswd(String pswd)
    {
        this.pswd=pswd;
    }
    void setcity(String city)
    {
        this.city=city;
    }
    void setbob(String bob)
    {
        this.bob=bob;
    }
    void Print()
    {
        System.out.println(acc);
        System.out.println(name);
        System.out.println(city);
        System.out.println(bob);
    }
}
public class Account {
    public static void main(String[] args) {
        ac a=new ac(12122200022748L, "kyg", "Kotappa", "Hubballi", "Byahatti");
        a.Print();
        System.out.println("After Updation");
        a.setpswd("k");
        a.setcity("Dharwad");
        a.setbob("Sainagar");
        System.out.println(a.getacc());
        System.out.println(a.getname());
        System.out.println(a.getcity());
        System.out.println(a.getbob());
    }
    
}
