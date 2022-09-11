
public class Book {
	String bname="DSA",aname="Kotappa";
	int id=10;
	double price=5000;
	public Book() {
	}
	public Book(String bname, String aname, int id, double price) {
		this.bname = bname;
		this.aname = aname;
		this.id = id;
		this.price = price;
	}
	public Book(String bname, String aname, double price) {
		this.bname = bname;
		this.aname = aname;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bname=" + bname + ", aname=" + aname + ", id=" + id + ", price=" + price + "]";
	}
	
}
