public class StringEx 
{
    public static void main(String[] args) {
        String s1="Hello";
        String s2="Hello";
        String rev="";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2)); 
        StringBuffer s3=new StringBuffer("Hello");
        StringBuffer s4=new StringBuffer("Hello");
        StringBuffer s5=s4;
        System.out.println(s4==s5);
        System.out.println(s4.equals(s5));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        String a="Kotappa";
        String b=" Gandudi";
        System.out.println(b.trim());
        System.out.println(a.concat(b));


        // String Reverse 
        for(int i=s1.length()-1;i>-1;i--)
            rev=rev+s1.charAt(i);
        System.out.println(rev);
    }
    
}
