package Logical_Programs;

public class Palindrome {
	public static void main(String[] args) {
		
		String a="MADAM";
		String rev="";   //MADAM
		
		for(int i=a.length()-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
		}
		System.out.println(rev);
		if(a.equals(rev)) {
			System.out.println("Given string is palindrome");
		}
		else{
			System.out.println("Given string is not palindrome");
		}
	}

}
