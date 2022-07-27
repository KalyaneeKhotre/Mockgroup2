package method;

public class Static1 {
	
	static int a=20;
	public static void main(String[] args) {
		
		Static1 x1=new Static1();
		Static1 x2=new Static1();
		Static1 x3=new Static1();
		System.out.println(x1.a);
		System.out.println(x2.a);
		System.out.println(x3.a);
		
		x2.a=50;
		System.out.println(x1.a);
		System.out.println(x2.a);
		System.out.println(x3.a);
	}

}
