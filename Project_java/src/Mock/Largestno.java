package Mock;

import java.util.Arrays;

public class Largestno {

	public static void main(String[] args)
	{
		int ar[]= {10,20,30};
		//int size=ar.length;
		Arrays.sort(ar);
		System.out.println("Numbers:"+Arrays.toString(ar));
		int max=ar[ar.length-1];
		System.out.println("Highest no."+max);
		
	}
}
