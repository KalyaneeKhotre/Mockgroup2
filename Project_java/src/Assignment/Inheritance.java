package Assignment;

public class Inheritance {
	static int a=50;
	int b=20;
	
	public void add()
	{
		System.out.println("New Method");
	}
	
	public static void main(String[] args) {
		//Inheritance.add();
		Inheritance i=new Inheritance();
		i.add();
		System.out.println(a);
		System.out.println(i.b);
	}

}
