package Casting;

public class TestUpcasting {
	
public static void main(String args[])
{
System.out.println("*****Superclass object*****");	
Upcasting x=new Upcasting();
x.demo();
x.set();
x.staticTest();

System.out.println("*****Subclass object*****");
Upcasting1 y=new Upcasting1();
y.demo();
y.set();
y.sub();
y.staticTest();    //non override

System.out.println("*****Up casting*****");
Upcasting z=new Upcasting1();
z.demo();
z.set();
z.staticTest();

Upcasting1 sub=(Upcasting1)new Upcasting();  //downcasting
sub.demo();
sub.set();
}
	
}
