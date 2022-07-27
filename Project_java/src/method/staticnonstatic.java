package method;

public class staticnonstatic {
	static int a=10;   //static variable
	       int b=20;   //non static variable
	       
	 staticnonstatic()  //user define constructor with zero argument
	 {
		 a=50;
		 b=60;
	 }
	 staticnonstatic(int z) //user define with argument
	 {
		 a=20;
		 b=10;
	 }
	 staticnonstatic(char u) //user define with argument
	 {
		 a=56;
	 }
	 public static void main(String[] args)
	 {
		 System.out.println(a);
		 
		 staticnonstatic x=new staticnonstatic();//calling constructor
		 System.out.println(a);
		 System.out.println(x.b);
		 
		 staticnonstatic y=new staticnonstatic(89); //calling constructor
		 //System.out.println(y.a);
		 System.out.println(y.b);
		 
		 staticnonstatic z=new staticnonstatic('$'); //calling constr
		// System.out.println(z.a);
		 System.out.println(z.b);
	 }


}
