public class MethodOverloading {

    static void add(int a,int b)
    {
        System.out.println(a+b);
    }
    static void add(float a,int b)
    {
        System.out.println(a+b);
    }
    static void add(double a,int b)
    {
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        float a=10;
        int b=20;
        add(a,b);
    }
}
