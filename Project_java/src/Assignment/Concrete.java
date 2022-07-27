package Assignment;

public class Concrete extends Abstract{
	
	public void Test()
	{
		System.out.println("Testing");
	}
	
	public void Demo()
	{
		System.out.println("Demo");
	}
	
	public static void main(String[] args) {
		
		Concrete c=new Concrete();
		c.Demo();
		c.Test();
		
		System.out.println(c.a);
	}


}
