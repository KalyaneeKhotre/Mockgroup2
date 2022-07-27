package Logical_Programs;

import java.util.Arrays;

public class AnagramNo {
	
	public static void main(String[] args) {
		
		String x="Kalyani";
		String y="yaniKal";
		
		char a[]=x.toCharArray();
		char b[]=y.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		Boolean result=Arrays.equals(a, b);
		
		if(result==true)
		{
			System.out.println("String are Anagram");
		}
		else
		{
			System.out.println("String are not Anagram");
		}
	}

}
