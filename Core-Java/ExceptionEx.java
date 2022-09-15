class Pt
{
    void Display()
    {
        System.out.println("Display method is Executed");
    }
}
class Cd extends Pt
{

}
public class ExceptionEx {
    public static void main(String[] args) {


        // AirthematicException
        int x=10;
        int y=0;
        try {
            int c=x/y;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }


        // ArrayIndexOutOfBoundException
        int a[]={10,20,30};
        try
        {
            System.out.println(a[4]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch(Throwable e)
        {
            System.out.println(e);
        }
        

        //ClassCastException
        Pt p=new Pt();
        try
        {
            Cd c=(Cd)p;
            c.Display();
        }
        catch(ClassCastException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Main End");
        }


        //NullPointerException
        try
        {
            Pt p1=null;
            p1.Display();
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
    }
}
