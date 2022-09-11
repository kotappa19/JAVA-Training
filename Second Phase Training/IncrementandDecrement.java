public class IncrementandDecrement {
    public static void main(String[] args) {
        int a=10,b=20,c=30;
        // a=a++ + ++a + 10 + ++a + 11;
        // System.out.println(++a);
        // System.out.println(a++);
        // // System.out.println(a);
        // c=a + b++ + c-- + --c + ++b + --a + a;
        // System.out.println(++a);
        // System.out.println(b++);
        // System.out.println(a--);
        // System.out.println(a);
        // System.out.println(b++);
        // System.out.println(b);
        // System.out.println(c);
        c=a + --b + ++c + --c + --b + ++a + a--;
        a=a-- + a++ + --b + c;
        b=b-- + --c;
        System.out.println(++c);
        System.out.println(a++);
        System.out.println(--b);
        System.out.println(c--);
        System.out.println(--a);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
