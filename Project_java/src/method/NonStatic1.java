package method;

public class NonStatic1 {
	 int a=20;
	 public static void main(String[] args) {
		
		 NonStatic1 T=new NonStatic1();
		 NonStatic1 T1=new NonStatic1();
		 NonStatic1 T2=new NonStatic1();
		 
		 System.out.println(T.a);
		 System.out.println(T1.a);
		 System.out.println(T2.a);
		 
		T2.a=50;
		 System.out.println(T2.a);
		 System.out.println(T1.a);
		 System.out.println(T.a);
		 
		
		 
	}

}
