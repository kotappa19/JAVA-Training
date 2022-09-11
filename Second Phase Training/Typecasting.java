public class Typecasting {
    public static void main(String[] args) {
        char c='k';
        int i=c;
        int x=(int)(short)(int)(float)(long)5.4d;
        int asc=65;
        char ch=(char)asc;
        byte b=(byte)(short)(int)4.5d;
        int in=(int)(long)5.6f;
        int l=(int)12345678912233445l;
        System.out.println(i+" "+x+" "+ch+" "+b+" "+l+" "+in);
        
    }
}
