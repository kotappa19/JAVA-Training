class Parent{
    public void hello(){
        System.out.println("Hi");
    }
}
class Child extends Parent{
    public void reply(){
        System.out.println("Hello");
    }
}
public class Assessment extends Parent{
    public static void main(String[] args) {
        Assessment a = (Assessment) new Parent();
        Assessment a1 = (Assessment) new Parent();
        a1.hello();
    }    
}