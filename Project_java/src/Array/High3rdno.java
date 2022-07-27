package Array;

import java.util.Arrays;

public class High3rdno {
	
	public static void main(String[] args) {
		
		int array[]= {10,20,25,63,96,57};
		//int size=array.length;
		Arrays.sort(array);
		System.out.println("Sorted array::"+Arrays.toString(array));
		int max=array[array.length-3];
		System.out.println("Third largest:"+max);
	}

}
