public class MethodExample {
    public static void main(String[] args) {
        System.out.println(m1(10));
        System.out.println(m2(10.1f, 5.3d));
        System.out.println(m3("Appu"));

    }
    public static String m1(int a){
        System.out.println(a);
        return "Kotappa";
    }
    public static int m2(float f,double d){
        System.out.println(f+" "+d);
        return 20;
    }
    public static boolean m3(String str){
        System.out.println(str);
        return true;
    }
}
