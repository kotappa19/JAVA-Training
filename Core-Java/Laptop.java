class laptop {
    String brand;
    double price;
    String color;
    laptop(String br,double pr,String cl)
    {
        brand=br;
        price=pr;
        color=cl;
    }
    void Details()
    {
        System.out.println(brand);
        System.out.println(price);
        System.out.println(color);        
    }
}
public class Laptop
{
    public static void main(String[] args) {
        laptop lap=new laptop("HP",31000,"black");
        lap.Details();
    }
}
