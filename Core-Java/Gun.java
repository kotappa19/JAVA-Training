
public class Gun {
	private String guncolor="black";
	private double gunprice=10000;
	private Bullet b;
	
	public String getGuncolor() {
		return guncolor;
	}

	public void setGuncolor(String guncolor) {
		this.guncolor = guncolor;
	}

	public double getGunprice() {
		return gunprice;
	}

	public void setGunprice(double gunprice) {
		this.gunprice = gunprice;
	}

	public Bullet getB() {
		return b;
	}

	public void setB(Bullet b) {
		this.b = b;
	}

	public void gundetails() {
		System.out.println("Gun Color  "+guncolor+"\nGun Price  "+gunprice);
		b.bulletdetails();
	}
}
