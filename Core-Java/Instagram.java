class insta
{
    private String user,email,loc,story,pswd;
    private long cno;
    insta(String user,String pswd,String email,long cno,String story,String loc)
    {
        this(user,pswd,email,cno);
        this.story=story;
        this.loc=loc;
    }
    insta(String user,String pswd,String email,long cno)
    {
        this.user=user;
        this.pswd=pswd;
        this.email=email;
        this.cno=cno;
    }
    String getuser()
    {
        return user;
    }
    long getcno()
    {
        return cno;
    }
    String getloc()
    {
        return loc;
    }
    String getstory()
    {
        return story;
    }
    void setuser(String user)
    {
        this.user=user;
    }
    void setcno(long cno)
    {
        this.cno=cno;
    }
    void setemail(String email)
    {
        this.email=email;
    }
    void setloc(String loc)
    {
        this.loc=loc;
    }
    void setstory(String story)
    {
        this.story=story;
    }
    void setpswd(String pswd)
    {
        this.pswd=pswd;
        System.out.println("Password Reset Successfully");
    }
    void Print()
    {
        System.out.println(user);
        System.out.println(cno);
        System.out.println(story);
        System.out.println(loc);
    }
}
public class Instagram {
    public static void main(String[] args) {
        insta i=new insta("Kotappa","kyg","kygandudi@gmail.com",9611828660L,"Happy","Hubballi");
        i.Print();
        i.setuser("Girija");
        i.setcno(8861255637L);
        i.setemail("gygandudi@gmail.com");
        i.setloc("Dharwad");
        i.setstory("Always Happy");
        i.setpswd("gyg");
        System.out.println("After Updation");
        System.out.println(i.getuser());
        System.out.println(i.getcno());
        System.out.println(i.getstory());
        System.out.println(i.getloc());
    }
    
}
