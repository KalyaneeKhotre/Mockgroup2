package Scanner;

import java.util.Scanner;

public class Scan {
	
	public static void main(String[] args)
	{
		Scanner demo=new Scanner(System.in);  //scanner class object
		System.out.println("Enter the Integer");
		int Value=demo.nextInt();
		System.out.println("You entered value is"+Value);
		
		System.out.println("Enter the Float");
		float sd=demo.nextFloat();
		System.out.println("You entered value is"+sd);
		
		System.out.println("Enter the String");
		String st=demo.next();
		System.out.println("You entered value is"+st);
		
		demo.close();
	}

}
