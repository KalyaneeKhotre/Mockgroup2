package Casting;

public class Implicit {

	public static void main(String[] args) {
		
		byte a=67;  //Memory size is 1 byte
		System.out.println(a);
		
		int b=a;
		System.out.println(b); //Memory size is 4 byte  
		
		double c=b;
		System.out.println(c);  //Memory size is 8 byte
	}
}
