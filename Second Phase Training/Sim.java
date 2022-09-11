
public class Sim {
	String serviceprovider,color;
	long number;
	
	public Sim() {
		super();
	}
	public Sim(String color, long number) {
		this.color = color;
		this.number = number;
	}
	public Sim(String serviceprovider, String color, long number) {
		this(color,number);
		this.serviceprovider = serviceprovider;
	}
	public String getServiceprovider() {
		return serviceprovider;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public long getNumber() {
		return number;
	}	
}
