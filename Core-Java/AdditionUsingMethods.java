public class AdditionUsingMethods {
    public static void main(String[] args) {
        System.out.println(m1()+m2());
        m3(10);
        m4(20, 25.4f, "Appu");
    }
    
    public static int m1(){return 10;}
    public static int m2(){return 20;}

    public static void m3(int a){
        System.out.println(a);
    }

    public static void m4(int a,float f,String s){
        System.out.println(a+" "+f+" "+" "+s);
    }
}
