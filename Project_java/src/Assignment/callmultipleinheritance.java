package Assignment;

public class callmultipleinheritance implements Interface,Interface1{
	
	public void M1()
	{
		System.out.println("First method");
	}
	public void M2()
	{
		System.out.println("Second method");
	}
	public void M3()
	{
		System.out.println("Third method");
     }
	public void M4()
	{
		System.out.println("Third method");
     }
	public static void main(String[] args) {
		callmultipleinheritance c= new callmultipleinheritance();
		c.M1();
		c.M2();
		c.M3();
		c.M4();
		System.out.println(c.a);
		System.out.println(c.b);
	}
}