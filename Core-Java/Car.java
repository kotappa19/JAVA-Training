class Engine
{
    long engno,cc;
    Engine(long engno,long cc)
    {
        this.engno=engno;
        this.cc=cc;
    }
}
class cars
{
    String brand,color;
    int seats;
    Engine e;
    cars(String brand,String color,int seats,Engine e)
    {
        this.brand=brand;
        this.color=color;
        this.seats=seats;
        this.e=e;
    }
    void Print()
    {
        System.out.println(brand);
        System.out.println(color);
        System.out.println(seats);
        System.out.println(e.engno);
        System.out.println(e.cc);

    }
}
public class Car {
    public static void main(String[] args) {
        cars c=new cars("Audi","White",5,new Engine(6747321134L, 4000L));
        c.Print();
    }
}
