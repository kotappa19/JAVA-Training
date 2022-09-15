class Parent
{
    static int a=10;
    static void Test()
    {
        System.out.println("From Parent");
    }
}
public class MethodShadowing extends Parent {
    static int a=20;
    public static void main(String[] args) {
        Parent p=new Parent();
        p.Test();
        MethodShadowing m=new MethodShadowing();
        m.Test();
        Parent p1=new MethodShadowing();
        p1.Test();
        System.out.println(p1.a);

    }
    static void Test()
    {
        System.out.println("From Child");
    }
}
