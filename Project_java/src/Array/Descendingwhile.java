package Array;

import java.util.Arrays;

public class Descendingwhile {
	
public static void main(String[] args) {
		
		int ar[]= {10,60,30,40,20};
		int i=4,j=0;   // index value is 4
		System.out.println("Original Array");
		while(j<5)
		{
			System.out.println(ar[j]);
			j++ ;
		}
		Arrays.sort(ar);
		System.out.println("Arrays in descending order");
		while(i>=0)
		{
			System.out.println(ar[i]);
			i-- ;
		}

}
}
