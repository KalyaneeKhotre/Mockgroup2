package Inheritance;

public class Super1 extends Super {
	
	int a=90;   //global
	
	public void Test()
	{
		int a=80;   //local
		System.out.println(a);       //local variable from same class
		System.out.println(this.a);  //global variable from same class
		System.out.println(super.a); //global variable from diff class
	}
	
	//public static void main(String[] args)
	//{
		//Super1 s=new Super1();
		//s.Test();
		
	//}
	

}
