package method;

public class Localglobal {

int a= 20;
 
public void Test()
{
	int b=60;
	System.out.println(a);
	System.out.println(b);
}
public void Test1()
{
	int c=80;
	System.out.println(a);
	//System.out.println(b);
	System.out.println(c);
}
public static void main(String[] args) {
	Localglobal s= new Localglobal();
	s.Test();
	s.Test1();
	
}
}
