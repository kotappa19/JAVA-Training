
public class BookEncapsulation {
	String bname,author;
	int npages=100;
	double price=5000;
	
	public BookEncapsulation(String bname, String author, int npages, double price) {
		super();
		this.bname = bname;
		this.author = author;
		this.npages = npages;
		this.price = price;
	}
	
	public BookEncapsulation() {
		super();
	}

	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getNpages() {
		return npages;
	}
	public double getPrice() {
		return price;
	}
	
}
