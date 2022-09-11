import java.util.*;
public class BookEncapsulationDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean accept=true;
		Scanner sc=new Scanner(System.in);
		BookEncapsulation b=new BookEncapsulation();
		do {
			System.out.println("1-Create Book\n2-Fetch Book\n3-Exit\nEnter your Choice\n");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter the Book Details\nEnter the Book Name");
				String book=sc.next();
				b.setBname(book);
				System.out.println("Enter the Author Name");
				String author=sc.next();
				b.setAuthor(author);
			break;
			case 2:if(b==null) {
				System.out.println("Book is not present");
			}
			else {
				System.out.println("Book Details\n"+b.getAuthor()+" "+b.getBname()+" "+b.getNpages()+" "+b.getPrice());
			}
			break;
			case 3:System.out.println("Do you want to Exit(y/n)");
			char c=sc.next().charAt(0);
			if(c=='y' || c=='Y') {
				accept=false;
			}
			else if(c=='n' || c=='N') {
				System.out.println("You have not exited");
			}
			else {
				System.out.println("Enter either Yes or No");
			}
			break;
			default:System.out.println("Enter a valid choice");
			}
		}while(accept);
		
	}

}
