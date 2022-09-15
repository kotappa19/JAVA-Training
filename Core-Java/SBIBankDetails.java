import java.util.*;
class Account
{
    private String ifsc;
    private long cno,accno;
    Account(String ifsc,long accno,long cno)
    {
        this.ifsc=ifsc;
        this.accno=accno;
        this.cno=cno;
    }
    String getifsc()
    {
        return ifsc;
    }
    long getaccno()
    {
        return accno;
    }
    long getcno()
    {
        return cno;
    }
    void setcno(long cno)
    {
        this.cno=cno;
    }
}
class Bank
{
    String bname,mname;
    Bank(String bname,String mname)
    {
        this.bname=bname;
        this.mname=mname;
    }
}
class SBI extends Bank
{
    String branch;
    Account a;
    SBI(String branch,String bname,String mname)
    {
        super(bname,mname);
        this.branch=branch;
    }
    void CreateAccount(Account a)
    {
        this.a=a;
        System.out.println("Account is created successfully");
    }
    void DeleteAccount()
    {
        if(this.a==null)
        {
            System.out.println("Account is not present");
        }
        else
        {
            this.a=null;
            System.out.println("Account deleted successfully");
        }
    }
    void UpdateDetails()
    {
        if(this.a==null)
        {
            System.out.println("Account is not present");
        }
        else
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Contact number to update");
            long cno=sc.nextLong();
            a.setcno(cno);
            System.out.println("Contact number updated successfully");
        }
    }
    void Display()
    {
        if(this.a==null)
        {
            System.out.println("Account is not present");
        }
        else
        {
            System.out.println("Bank name\t"+bname);
            System.out.println("Branch name\t"+branch);
            System.out.println("Manager name\t"+mname);
            System.out.println("IFSC code\t"+a.getifsc());
            System.out.println("Account number\t"+a.getaccno());
            System.out.println("Contact number\t"+a.getcno());
        }
    }
}
public class SBIBankDetails {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Bank name");
        String bname=sc.nextLine();
        System.out.println("Enter the Branch name");
        String branch=sc.nextLine();
        System.out.println("Enter the Manager name");
        String mname=sc.nextLine();
        SBI s=new SBI(branch, bname, mname);
        while(true)
        {
            System.out.println("1-Create Account\n2-Delete Account\n3-Update Details\n4-Display Details\n5-Exit\nEnter your choice");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1: if(s.a==null)
                        {
                            System.out.println("Enter the IFSC code");
                            String ifsc=sc.next();
                            System.out.println("Enter the Account Number");
                            long accno=sc.nextLong();
                            System.out.println("Enter the Contact Number");
                            long cno=sc.nextLong();
                            s.CreateAccount(new Account(ifsc, accno, cno));
                        }
                        else
                        {
                            System.out.println("Account is already present");
                        }
                        break;
                case 2:s.DeleteAccount();
                        break;
                case 3:s.UpdateDetails();
                        break;
                case 4:s.Display();
                        break;
                case 5:System.exit(0);
                default:System.out.println("Etner the valid Choice");

            }
        }
    }
}
