public class AlphaNumber {
    public static void main(String[] args) {
        char a='k';
        if((a>=65 && a<=90)||(a>=97 && a<=122))
            System.out.println("Its Alphabet");
        else if(a>=48 && a<=57)
            System.out.println("Its Number");
        else
            System.out.println("Its Special Symbol");

    }
}
