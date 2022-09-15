interface Interface1{
   abstract public void Display();
   abstract public void Show();
   int a=10;
   static int b=20;
   static void Fun()
   {
      System.out.println("Non Static Method");
   }
}
interface Interface2 extends Interface1
{
   abstract public void See();
}
public class InterfaceExample implements Interface1,Interface2
{
   public void Display()
   {
      System.out.println("Display method is implemented");
   }
   public void Show()
   {
      System.out.println("Show Method is implemented");
   }
   public void See()
   {
      System.out.println("See Method is implemented");
   }
   public static void main(String[] args) {
      InterfaceExample i=new InterfaceExample();
      i.Display();
      i.Show();
      i.See();
   }
}