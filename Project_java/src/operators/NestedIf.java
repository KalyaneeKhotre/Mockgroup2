package operators;

public class NestedIf {
	public static void main(String[] args) {
		String UN="PQR";
		String PASS="XYZ";
	
		if(UN=="ABC") {
			System.out.println("Correct user name");
		
		if(PASS=="XYZ") {
			System.out.println("Password is correct");
			System.out.println("Login Successful");
		}
		else {
			System.out.println("Wrong Password");
			System.out.println("Login Failed");
		}
		}
		else {
			System.out.println("Wrong Username");
			System.out.println("Login Failed");
		}
	}

}
