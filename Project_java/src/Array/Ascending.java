package Array;

import java.util.Arrays;

public class Ascending {
	
	public static void main(String[] args) {
		
		int ar[]= {10,60,30,40,20};
		System.out.println("Original Array");
		for(int i=0;i<=ar.length-1;i++) 
		{
			System.out.println(ar[i]);
		}
		Arrays.sort(ar);
		System.out.println("Arrays in ascending order");
		for(int i=0;i<=ar.length-1;i++) 
		{
			System.out.println(ar[i]);
		}
		
		//while(i<=ar.length-1)
		//i++;
		//{
			//System.out.println(ar[i]);
			//i++ ;
		}
		//i++;
		
	}


