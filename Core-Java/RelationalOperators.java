public class RelationalOperators {
    public static void main(String[] args) {
        int a=10,b=20,c=30;
        System.out.println(a>b);
        System.out.println(b>=a);
        System.out.println(b<a);
        System.out.println(b<=a);
        System.out.println(b==a);
        System.out.println(2>3 || 3<4);
        System.out.println(2<3 && 5>2);
        System.out.println(((a>b)&&(a<b))||((10<8))&&(7<8));
        String s=a>b?"a is bigger":"b is bigger";
        System.out.println(s);
        String s1=a%2==0?"a is even number":"a is odd number";
        System.out.println(s1);
        String s3=(a>b && a>c)?"a is greatest":(b>c)?"b is greatest":"c is greatest";
        System.out.println(s3);

    }
}
