class Whatsapp{
    private String name="Kotappa",status="King";
    private long phone=9611828660L;
    Whatsapp(String name,long phone,String status)
    {
        this(name,phone);
        this.status=status;
    }
    Whatsapp(String name,long phone)
    {
        this.name=name;
        this.phone=phone;
    }
    public String getUsername()
    {
        return name;
    }
    public void setUsername(String name)
    {
        this.name=name;
    }
    public String getStatus()
    {
        return status;
    }
    public void setStatus(String status)
    {
        this.status=status;
    }
    public long getPhone()
    {
        return phone;
    }
    public void setPhone(long phone)
    {
        this.phone=phone;
    }
    public void Print()
    {
        System.out.println(name);
        System.out.println(phone);
        System.out.println(status);
    }

}
public class Encapsulation {
    public static void main(String[] args) {
        Whatsapp w=new Whatsapp("Adam",7899115929L,"Be Happy");
        w.Print();
        System.out.println("After Updating");
        w.setUsername("Girija");
        w.setStatus("MOM");
        w.setPhone(8861255637L);
        // w.Print();
        System.out.println(w.getUsername());
        System.out.println(w.getStatus());
        System.out.println(w.getPhone());

    }
    
}
