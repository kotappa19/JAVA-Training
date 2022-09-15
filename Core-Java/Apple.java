public class Apple extends Fruit {
    public static void main(String[] args) {
        Apple a=new Apple();
        a.FromApple();
        a.FromFruit();
        Fruit f=new Fruit();
        f.FromFruit();

    }
    public void FromApple()
    {
        System.out.println("Method from Apple");
    }
}
