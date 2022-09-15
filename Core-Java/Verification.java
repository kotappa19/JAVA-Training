import java.util.*;
public class Verification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int password=1234;
		System.out.println("Enter Password");
		Scanner sc=new Scanner(System.in);
		int checkpassword=sc.nextInt();
		if(password==checkpassword) {
			System.out.println("Login Successfull");
		}
		else {
			try {
				throw new InvalidPasswordException();
			}
			catch(InvalidPasswordException e) {
				System.out.println("Invalid Password");
			}
		}
		System.out.println("Hi Java Hello Java");
	}

}
