import java.util.Objects;

public class BookEx {
	String bname,author;
	double price;
	@Override
	public int hashCode() {
		return Objects.hash(author, bname, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookEx other = (BookEx) obj;
		return Objects.equals(author, other.author) && Objects.equals(bname, other.bname)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
	@Override
	public String toString() {
		return "BookEx [bname=" + bname + ", author=" + author + ", price=" + price + "]";
	}
	
}
