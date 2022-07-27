package constructor;

public class callTest {
	public static void main(String[] args)
	{
		Test T=new Test();
		Test T1=new Test(50,50,10);
		T.addition();
		T.demo();
		T1.addition();
		System.out.println(T.p);
		System.out.println(T.q);
		System.out.println(T.r);
		
	}

}
