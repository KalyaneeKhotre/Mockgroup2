package Logical_Programs;

import java.util.Arrays;

public class Highestno {
	
	public static void main(String[] args) {
		
		
		int ar[]= {55,45,36,79,49};
		
		Arrays.sort(ar);
		
		System.out.println("Sorted Array::"+Arrays.toString(ar));
		
		int max=ar[0];
		
		System.out.println("Third highest no."+ max);
	}

}
