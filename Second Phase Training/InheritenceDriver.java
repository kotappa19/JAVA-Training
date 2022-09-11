
public class InheritenceDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritenceEx p=new InheritenceEx();
		p.i=120;
		System.out.println(p.i);
		InheritenceExChild c=new InheritenceExChild();
		System.out.println(c.j);
		c.i=120;
		System.out.println(c.i);
		c.m1();
	}

}
