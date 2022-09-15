interface Interface1
{
    abstract public void Display();
}
interface Interface2
{
    abstract public void Display();
}
abstract class Example
{
    abstract public void Show();
}
public class ClassInterface extends Example implements Interface1,Interface2 {
 public void Display()
 {
     System.out.println("Display method is implemented");
 }
 public void Show()
 {
     System.out.println("Show method is implemeted");
 }
    public static void main(String[] args) {
     ClassInterface c=new ClassInterface();
     c.Display();;
     c.Show();
 }   
}
