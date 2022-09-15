import java.util.Scanner;

public class ATMApplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int balance=10000;
        int pin=2000;
        boolean exit=true;
        do {
            System.out.println("**********Welcome To ATM Machine**********\n1-View Balance\n2-Withdraw\n3-Deposit\n4-Exit");
            int ch=sc.nextInt();
            switch (ch) {
                case 1:{
                        System.out.println("Enter the PIN");
                        int upin=sc.nextInt();
                        if (upin==pin) {
                            System.out.println("Your Current Balance is "+balance);
                        } else {
                            System.out.println("You Have Entered Wrong PIN Please Enter Correct PIN");
                        }
                        break;

                }
                case 2:{
                        System.out.println("Enter the PIN");
                        int upin=sc.nextInt();
                        if (upin==pin) {
                            System.out.println("Enter the Amount to Withdraw");
                            int amt=sc.nextInt();
                            if(amt>balance){
                                System.out.println("You Have Entered More Amount Your Balance is    "+balance+"Enter Amount less than Your Balance");
                                break;
                            }
                            if(amt%100!=0){
                                System.out.println("Enter the Amount in 100's");
                                break;
                            }
                            balance-=amt;
                        } else {
                            System.out.println("You Have Entered Wrong PIN Please Enter Correct PIN");
                        }
                break;

                }
                case 3: {
                    System.out.println("Enter the PIN");
                    int upin=sc.nextInt();
                    if (upin==pin) {
                        System.out.println("Enter the Amount to Deposit");
                        int amt=sc.nextInt();
                        if (amt%100!=0) {
                            System.out.println("Enter the Amount in 100's");
                            break;
                        }
                        balance+=amt;
                    } else {
                       System.out.println("You Have Entered Wrong PIN Please Enter Correct PIN"); 
                    }
                    break;
                }
                case 4:{
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
                default:System.out.println("Enter Valid Choice");
            }
        } while (exit);
    }
}
