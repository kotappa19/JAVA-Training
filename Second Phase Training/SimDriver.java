
public class SimDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sim s=new Sim("Airtel", "Red", 9611828660l);
		System.out.println(s.getColor()+" "+s.getNumber()+" "+s.getServiceprovider());
		s.setColor("Blue");
		System.out.println(s.getColor()+" "+s.getNumber()+" "+s.getServiceprovider());
	}

}
