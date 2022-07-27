package method;

public class Staticargument {
	public static void addition(int a,int b) //static with arg
	{
		int c=a+b;
		System.out.println("Addition is "+c);
	}
	public void multiplication(int a,int b)  //non-static with arg
	{
		int c=a*b;
		System.out.println("Multiplication is "+c);
	}
	public static void main(String[] args)
	{
		Staticargument.addition(20, 40);
		
		Staticargument T= new Staticargument(); //object for non-static
		
		T.multiplication(20, 20);
	}
}
