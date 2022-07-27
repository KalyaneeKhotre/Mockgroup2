package method;

import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {
		Scanner Demo=new Scanner(System.in);
		System.out.println("Enter the Number");
		int value=Demo.nextInt();
		System.out.println("Entered number is"+value);
		
		System.out.println("Enter the float");
		float sd=Demo.nextFloat();
		System.out.println("Entered number is"+sd);
		
		System.out.println("Enter the string");
		String sf=Demo.next();
		System.out.println("Entered string is"+sf);
		
		Demo.close();
		
		
	}

}
