abstract class Parent
{
    private void sum(int a)
    {
        System.out.println("P");
    }
    // protected void x()
    // {
    //     System.out.println("c");
    // }
}
class Child extends Parent
{
    private void sum(int a)
    {
        System.out.println("C");
    }
    // protected void x()
    // {
    //     System.out.println("x");
    // }
    Child(){}
    public static void main(String[] args) {
        // Child c=new Child();
        // Parent p=new Parent();
        // Child c1=new Parent();
        Parent p1=new Child();
        p1.sum(20);
    }
}
   
