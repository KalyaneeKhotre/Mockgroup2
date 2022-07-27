package method;

public class staticDemo {
	public static void M1() {
		System.out.println("Static method from M1");
	}
	public static void M2() {
		System.out.println("Static method from M2");
	}
 public static void main(String[] args)
 {
	 System.out.println("Main method started");
	 M1();
	 M2();
	 System.out.println("Main method ended");
 }
}
