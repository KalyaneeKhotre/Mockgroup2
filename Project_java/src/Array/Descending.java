package Array;

import java.util.Arrays;

public class Descending {

public static void main(String[] args) {
		
		int ar[]= {10,60,30,40,20};
		System.out.println("Original Array");
		
		for(int i=0;i<=ar.length-1;i++) 
		{
			System.out.println(ar[i]);
		}
		
		Arrays.sort(ar);
		
		System.out.println("Arrays in Descending order");
		
		for(int i=ar.length-1;i>=0;i--) 
		{
			System.out.println(ar[i]);
		}
}
}
