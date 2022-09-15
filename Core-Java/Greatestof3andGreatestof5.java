import javax.lang.model.util.ElementScanner6;

public class Greatestof3andGreatestof5 {
    public static void main(String[] args) {
        int a=10,b=20,c=30,d=40,e=50;
        if(a>b && a>c && a>d && a>e)
            System.out.println(a+"  is greatest");
        else if(b>c && b>d && b>e)
            System.out.println(b+"  is greatest");
        else if(c>d && c>e)
            System.out.println(c+"  is greatest");
        else if(d>e)
            System.out.println(d+"  is greatest");
        else
            System.out.println(e+"  is greatest");
    }
}
