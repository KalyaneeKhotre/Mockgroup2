package Inheritance;

public class Demo2 extends Demo1 {
	
	public void success()
	{
		System.out.println("Corporate world");
	}
	
	public static void main(String[] args) {
		
		Demo2 d= new Demo2();
		d.Testing();
		d.development();
		d.success();
	}

}
