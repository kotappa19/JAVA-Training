abstract class Example
{
    abstract void Send();
    int x=10;
    static int y=20;
    void Receive()
    {
        System.out.println("Received Message");
    }

}
public class AbstractExample extends Example {
    void Send()
    {
        System.out.println("Message Sent");
    }
    public static void main(String[] args) {
        AbstractExample a=new AbstractExample();
        a.Send();
        a.Receive();
        System.out.println(a.x);
        System.out.println(a.y);
    }
}
