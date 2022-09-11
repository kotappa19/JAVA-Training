
public class GunCreator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gun g=new Gun();
		g.setB(new Bullet());
		g.gundetails();
		g.getB().setSize(3);
		g.getB().setPrice(30);
		g.getB().setColor("Brown");
		g.gundetails();
	}

}
