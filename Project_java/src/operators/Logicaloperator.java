package operators;

public class Logicaloperator {
	public static void main(String args[])
	{
		System.out.println((10>5)&&(12>3));
		System.out.println((10>5)&&(12<3));
		
		//System.out.println((10>5)||(12>3));
		//System.out.println((10>5)||(12<3));
		System.out.println((10<5)||(12<3));
		
		System.out.println(!(3==5));
		System.out.println(!(5>3));
	}

}
