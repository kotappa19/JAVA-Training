// class demo
// {
//     static void display()
//     {
//         System.out.println("hey");
//     }
// }
public class test {
    static int a=20;
    public static void set(int b)
    {
        a=b;
    }
    public static int get()
    {
        return a;
    }
    public static void main(String[] args) {
        test t=new test();
        System.out.println(t.get());
    }
}