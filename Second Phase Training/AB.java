
public interface AB {
	final static int a=10;
	public abstract void m1();
	public static void m2() {
		System.out.println("m2() method");
	}
	default void m3() {
		System.out.println("m3() method");
	}
}
