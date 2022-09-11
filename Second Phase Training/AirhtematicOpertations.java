public class AirhtematicOpertations {
    public static void main(String[] args) {
        int a=10,b=20,c=5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println((10+2*1)/2+8-10*2+(20%2));
        a+=b-=c*=a%=b/=10;
        System.out.println(a+" "+b+" "+c);
        a-=b+=c*=c/=a+=20;
        System.out.println(a+" "+b+" "+c);
        

    }
}
