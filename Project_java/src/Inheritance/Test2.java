package Inheritance;

public class Test2 implements Test,Test1
{
	public void Demo()
	{
		System.out.println("Call Demo");
	}
	public void Demo1()
	{
		System.out.println("Call Demo1");
	}
	public void Demo2()
	{
		System.out.println("Call Demo2");
	}
	public void Demo3()
	{
		System.out.println("Call Demo3");
	}
	public static void main(String[] args) {
		Test2 t=new Test2();
		t.Demo();
		t.Demo1();
		t.Demo2();
		t.Demo3();
		System.out.println(Test.a);
		
	}

}
