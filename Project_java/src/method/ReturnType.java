package method;

public class ReturnType {
	static int Demo() {
		int x=10;
		int y=30;
		int z=x+y;
		return z;
	}
	static String Test() {
		return "Welcome";
	}
	public static void main(String[] args)
	{
		int z=Demo();
		String x=Test();
		System.out.println(z);
		System.out.println(x);
	}
}
