
class Parent
{
    // static int a=10;
    void Test()
    {
        System.out.println("From Parent");
    }
}
public class MethodOverridng extends Parent {
    // static int a=20;
    public static void main(String[] args) {
        Parent p=new Parent();
        p.Test();
        MethodOverridng m=new MethodOverridng();
        m.Test();
        Parent p1=new MethodOverridng();
        p1.Test();
        // System.out.println(p1.a);

    }
    void Test()
    {
        System.out.println("From Child");
    }
}
