import java.util.Scanner;

public class SimpleCalculatorUsingMethods {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      boolean exit=true;
      do{
          System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division\n5-Remainder\n6-Exit\nEnter Your Choice");
          int ch=sc.nextInt();
          switch (ch) {
              case 1: {
                  System.out.println("Enter the First Number");
                        int a=sc.nextInt();
                        System.out.println("Enter the Second Number");
                        int b=sc.nextInt();
                        addition(a, b);
                        break;
              }
                case 2: {
                    System.out.println("Enter the First Number");
                        int c=sc.nextInt();
                        System.out.println("Enter the Second Number");
                        int d=sc.nextInt();
                        subtraction(c,d);
                        break;
                }
                case 3:{
                    System.out.println("Enter the First Number");
                        int e=sc.nextInt();
                        System.out.println("Enter the Second Number");
                        int f=sc.nextInt();
                        multiplication(e, f);
                        break;
                }
                case 4: {
                    System.out.println("Enter the First Number");
                        int g=sc.nextInt();
                        System.out.println("Enter the Second Number");
                        int h=sc.nextInt();
                        division(g, h);
                        break;
                }
                case 5: {
                    System.out.println("Enter the First Number");
                        int i=sc.nextInt();
                        System.out.println("Enter the Second Number");
                        int j=sc.nextInt();
                        modular(i, j);
                        break;
                }
                case 6:{
                    System.out.println("Do you want to exit(y/n)");
                        char cx=sc.next().charAt(0);
                        if (cx=='y' || cx=='Y') {
                            exit=false;
                        } else if(cx=='n' || cx=='N'){
                            System.out.println("You are Still Logged in");
                        }
                        else{
                            System.out.println("Enter Yes or No");
                        }
                        break;
                    }
              default:System.out.println("Enter a Valid Choice");
          }

      }while(exit);
    }
    public static void addition(int a,int b){
        System.out.println("Addition    "+(a+b));
    }
    public static void subtraction(int a,int b){
        System.out.println("Substraction    "+(a-b));
    }
    public static void multiplication(int a,int b){
        System.out.println("Multiplication  "+(a*b));
    }
    public static void division(int a,int b){
        System.out.println("Division    "+(a/b));
    }
    public static void modular(int a,int b){
        System.out.println("Remainder   "+(a%b));
    }
}
