import java.util.*;
class Book
{
    private double price;
    Book(){}
    Book(double price)
    {
        this.price=price;
    }
    double getprice()
    {
        return price;
    }
    void setprice(double price)
    {
        this.price=price;
    }
    public String toString()
    {
        return ""+price;
    }
}
class HarryPotter extends Book
{   
    HarryPotter(double price)
    {
        super(price);
    }
    String author="Harry Potter";
    public String toString()
    {
        return author;
    }
}
class RomeoJuliet extends Book
{
    RomeoJuliet(double price)
    {
        super(price);
    }
    String author="Romeo Juliet";
    public String toString()
    {
        return author;
    }
}
class MyException extends Exception
{
    public MyException(String s)
    {
        super(s);
    }
}
class Library
{
    Book b;
    void AddBook(Book b) throws MyException
    {
        if(this.b!=null)
            throw new MyException("Book is Already present");
        else
        {
            this.b=b;
            System.out.println("Book Added Successfully");
        }
    }
    void RemoveBook() throws MyException
    {
        if(this.b==null)
            throw new MyException("Book is not There");
        else
        {
            if(b instanceof HarryPotter)
            {
                b=null;
                System.out.println("Harry Potter Book is Removed");
            }
            else if(b instanceof RomeoJuliet)
            {
                b=null;
                System.out.println("Romeo Juliet Book is Removed");
            }
        }
    }
    void Display() throws MyException
    {
        if(this.b==null)
            throw new MyException("Book is not There");
        else
        {
            if(b instanceof HarryPotter)
            {
                System.out.println("Harry Potter Book is there");
                System.out.println("The Price of the Harry Potter Book is\t"+b.getprice());
                System.out.println("The Author of the Harry potter Book is\t"+b.toString());
            }
            else if(b instanceof RomeoJuliet)
            {
                System.out.println("Romeo Juliet Book is there");
                System.out.println("The Price of Romeo Juliet Book is\t"+b.getprice());
                System.out.println("The Author of the Romeo Juliet Book is\t"+b.toString());
            }
        }
    }
    void CheckLibrary() throws MyException
    {
        if(this.b==null)
            throw new MyException("Book is not THERE");
        else
        {
            if(b instanceof HarryPotter)
                System.out.println("Harry Potter Book is Present");
            else if(b instanceof RomeoJuliet)
                System.out.println("Romeo Juliet Book is Present");
        }
    }
    public boolean equals(Object o)
    {
        return this==o;
    }
}
public class LibraryDriver {
    public static void main(String[] args) {
        Library l=new Library();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("1-Add Book\n2-Remove Book\n3-Display Details\n4-Check Library\n5-Check Whether two Objects are equal\n6-Exit\nEnter Your Choice");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:System.out.println("1-Add Harry Potter Book\n2-Add Romeo Juliet Book\nEnter Your choice");
                int c=sc.nextInt();
                if(c==1)
                {
                    try {
                        l.AddBook(new HarryPotter(1000));
                    } catch (MyException e) {
                        System.out.println(e);
                    }
                }
                else if(c==2)
                {
                    try {
                        l.AddBook(new RomeoJuliet(2000));
                    } catch (MyException e) {
                        System.out.println(e);
                    }
                }
                break;
                case 2:try {
                        l.RemoveBook();
                    } catch (MyException e) {
                        System.out.println(e);
                    }
                break;
                case 3:try {
                        l.Display();
                    } catch (MyException e) {
                        System.out.println(e);
                    }
                break;
                case 4:try {
                        l.CheckLibrary();
                    } catch (MyException e) {
                        System.out.println(e);
                    }
                break;
                case 5:System.out.println("1-To create new Object\n2-Assign new Object to old Object\nEnter your choice");
                    int z=sc.nextInt();
                    if(z==1)
                    {
                        Library l1=new Library();
                        if(l.equals(l1))
                            System.out.println("Both Objects are Same");
                        else
                            System.out.println("Both Objects are Different");
                    }
                    else if(z==2)
                    {
                        Library l2=l;
                        if(l.equals(l2))
                            System.out.println("Both Objects are Same");
                        else
                            System.out.println("Both Objects are Different");

                    }
                break;
                case 6:System.exit(0);
                default:System.out.println("Enter a valid Choice");
            }
        }

    }
}
