package constructor;

public class Test {
	int p;
	int q;
	int r;
	String name;
	String passwd;
	
	Test()
	{
	p=10;
	q=30;
	r=50;
	}
	Test(int a,int b,int c)
	{
	p=a;
	q=b;
	r=c;
	}
	Test(String name,String passwd)
	{
	}
	public void addition()
	{
		System.out.println(p+q+r);
	}
	public void demo()
	{
		System.out.println("Name- Velocity");
	}
}
