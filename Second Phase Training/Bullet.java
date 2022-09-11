
public class Bullet {
	private double size=2,price=10;
	private String color="Blue";
	
	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void bulletdetails() {
		System.out.println("Bullet Size  "+size+"\nBullet Price  "+price+"\nBullet Color  "+color);
	}
}
