abstract class Parent
{
    abstract void Send();
}
abstract class Abstraction extends Parent {
    abstract void Send();
}
public class Abstraction1 extends Abstraction
{
    void Send()
    {
        System.out.println("Message Sent");
    }
    public static void main(String[] args) {
        Abstraction1 a=new Abstraction1();
        a.Send();
    }
}
