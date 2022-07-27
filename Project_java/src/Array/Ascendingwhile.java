package Array;

import java.util.Arrays;

public class Ascendingwhile {
	
public static void main(String[] args) {
		
		int ar[]= {10,60,30,40,20};
		int i=0,j=0;
		System.out.println("Original Array");
		while(j<5)
		{
			System.out.println(ar[j]);
			j++ ;
		}
		Arrays.sort(ar);
		System.out.println("Arrays in ascending order");
		while(i<5)
		{
			System.out.println(ar[i]);
			i++ ;
		}
		
}	

}
