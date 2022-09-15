import java.util.*;
class user
{
    private String user;
    private double balance;
    private long cno;
    user(String user,double balance,long cno)
    {
        this.user=user;
        this.balance=balance;
        this.cno=cno;
    }
    String getuser()
    {
        return user;
    }
    double getbalance()
    {
        return balance;
    }
    long getcno()
    {
        return cno;
    }
    void setbalance(double balance)
    {
        this.balance=balance;
    }
}
class MyException extends Exception
{
    public MyException(String s)
    {
        super(s);
    }
}
class bank
{
    Scanner sc=new Scanner(System.in);
    long acno;
    user u;
    bank(long acno)
    {
        this.acno=acno;
    }
    void CreateAccount(user u) throws MyException
    {
        if(this.u!=null)
            throw new MyException("Account is already created");
        else
        {
            this.u=u;
            System.out.println("Account created Successfully");
        }
    }
    void Deposit() throws MyException
    {
        if(this.u==null)
            throw new MyException("Account is not there");
        else
        {
            System.out.println("Enter the amount to Deposit");
            double dep=sc.nextInt();
            u.setbalance(u.getbalance()+dep);
            System.out.println("Amount Deposited in the Account");
        }
    }
    void WithDraw() throws MyException
    {
        if(this.u==null)
            throw new MyException("Account is not there");
        else
        {
            System.out.println("Enter the amount to be withdrawn");
            double wd=sc.nextDouble();
            u.setbalance(u.getbalance()-wd);
            System.out.println("Amount withdrawn from Account");
        }
    }
    void DeleteAccount() throws MyException
    {
        if(this.u==null)
            throw new MyException("Account is not there");
        else
        {
            this.u=null;
            System.out.println("Account Deleted Successfully");
        }
    }
    void Display() throws MyException
    {
        if(this.u==null)
            throw new MyException("Account is not there");
        else
        {
            System.out.println("User name is\t"+u.getuser());
            System.out.println("Balance is\t"+u.getbalance());
            System.out.println("User Contact Number is\t"+u.getcno());
            
        }
    }
}
public class BankDriver {
    
}
