import java.util.*;
class Book
{
    private String title,author;
    double price;
    Book(String title,String author,Double price)
    {
        this.title=title;
        this.author=author;
        this.price=price;
    }
    String gettitle()
    {
        return title;
    }
    String getauthor()
    {
        return author;
    }
    double getprice()
    {
        return price;
    }
    void setprice(double price)
    {
        this.price=price;
    }
}
class MyException extends Exception
{
    public MyException(String s)
    {
        super(s);
    }
}
class Bag
{
    private String bagbrand,color;
    private double bprice;
    private int comp;
    Book b;
    Bag(String bagbrand,String color,double bprice,int comp)
    {
        this.bagbrand=bagbrand;
        this.color=color;
        this.bprice=bprice;
        this.comp=comp;
    }
    String getbagbrand()
    {
        return bagbrand;
    }
    String getcolor()
    {
        return color;
    }
    double getprice()
    {
        return bprice;
    }
    int getcomp()
    {
        return comp;
    }
    void AddBook(Book b) throws MyException
    {
        if(this.b!=null)
            throw new MyException("Bag is full");
        else
        {
            this.b=b;
            System.out.println("Book Added into the Bag");
        }
    }
    void RemoveBook() throws MyException
    {
        if(this.b==null)
            throw new MyException("Books are not there in Bag");
        else
        {
            this.b=null;
            System.out.println("Book is removed from the Bag");
        }
    }
    void UpdateBook() throws MyException
    {
        if(this.b==null)
            throw new MyException("Books are not there in Bag");
        else
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the new Price of the Book");
            double price=sc.nextDouble();
            b.setprice(price);
            System.out.println("Price updated Successfully");
        }
    }
    void Display() throws MyException
    {
        if(this.b==null)
            throw new MyException("Books are not there in Bag");
        else
        {
            System.out.println("Bag brand is\t"+bagbrand);
            System.out.println("Bag colour is\t"+color);
            System.out.println("Bag Price is\t"+bprice);
            System.out.println("No of Compartments in bag is\t"+comp);
            System.out.println("Book Title is\t"+b.gettitle());
            System.out.println("Book author is\t"+b.getauthor());
            System.out.println("Book Price is\t"+b.getprice());
        }
    }

}
public class bag {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Bag Brand");
        String bagbrand=sc.next();
        System.out.println("Enter the Bag colour");
        String color=sc.next();
        System.out.println("Enter the Bag Price");
        double bprice=sc.nextDouble();
        System.out.println("Enter the number of Compartments in Bag");
        int comp=sc.nextInt();
        Bag bg=new Bag(bagbrand, color, bprice, comp);
        while(true)
        {
            System.out.println("1-Add the Book into the Bag\n2-Remove the Book from the Bag\n3-Update Details of Book\n4-Display Details of the Bag\n5-exit");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:System.out.println("Enter the Book Title");
                        String title=sc.next();
                        System.out.println("Enter the Author name");
                        String author=sc.next();
                        System.out.println("Enter the Price of the Book");
                        double price=sc.nextDouble();
                    try {
                        bg.AddBook(new Book(title, author, price));
                    } catch (MyException e) {
                        System.out.println(e);
                    }
                        break;
                case 2:try {
                        bg.RemoveBook();
                    } catch (MyException e) {
                        System.out.println(e);
                    }
                        break;
                case 3:try {
                        bg.UpdateBook();
                    } catch (MyException e) {
                        System.out.println(e);
                    };
                        break;
                case 4:try {
                        bg.Display();
                    } catch (MyException e) {
                        System.out.println(e);
                    };
                        break;
                case 5:System.exit(0);
                default:System.out.println("Enter the valid choice");
            }
        }
    }
    
}
