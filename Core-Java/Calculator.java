import java.util.*; 
class Calculator {

    static int Add(int x,int y)
    {
        return x+y;
    }  
    static int Sub(int x,int y)
    {
        return x-y;
    }
    static int Mult(int x,int y)
    {
        return x*y;
    }
    static int Divide(int x,int y)
    {
        return x/y;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Addition of "+x+"  and  "+y+"  is  "+Add(x,y));
        System.out.println("substration of "+x+"  and  "+y+"  is  "+Sub(x,y));
        System.out.println("Multiplication of "+x+"  and  "+y+"  is  "+Mult(x,y));
        System.out.println("Division of "+x+"  and  "+y+"  is  "+Divide(x,y));
        sc.close();
    }
}
