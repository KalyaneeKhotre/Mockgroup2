package Inheritance;

public class This {

	int a=80;
	
	public void add()
	{
		int a=50;
		System.out.println(a);
		System.out.println(this.a);
	}
	public static void main(String[] args)
	{
	  This x=new This();
	  x.add();
	}
}
