class Mobile
{
    String brand,color;
    double price;
    Mobile(String brand,double price,String color)
    {
        this.brand=brand;
        this.price=price;
        this.color=color;
    }
}
class Redmi extends Mobile
{
    Redmi(String brand,double price,String color)
    {
        super(brand,price,color);
    }
    void Display()
    {
        System.out.println("Brand of the mobile is\t"+brand);
        System.out.println("Price of the mobile is\t"+price);
        System.out.println("Color of the mobile is\t"+color);
    }
}
public class MobileSuper {
    public static void main(String[] args) {
        Redmi r=new Redmi("Redmi note 7 pro", 15500, "Blue");
        r.Display();
    }
}
