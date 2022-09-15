
public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Kotappa";
		System.out.println(s.toUpperCase());
		String s1="APPU";
		System.out.println(s1.toLowerCase());
		System.out.println(s.concat(s1));
		System.out.println(s.charAt(0));
		char[] a=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			System.out.println(a[i]);
		}
		System.out.println(s.substring(1, 4));
		System.out.println(s.indexOf('t'));
		System.out.println(s.lastIndexOf('a'));
		System.out.println(s.contains("ta"));
		System.out.println(s.isEmpty());
		String s2="  KYG   ";
		System.out.println(s2.trim());
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s2));
		
				
	}

}
