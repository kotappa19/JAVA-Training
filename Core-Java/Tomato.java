public class Tomato extends Vegetable {
    public static void main(String[] args) {
        Vegetable v=new Tomato();
        v.PrintVegetable();
        Tomato t=(Tomato)v;
        t.PrintTomato();
    }
    void PrintTomato()
    {
        System.out.println("Child Class");
    }
}
