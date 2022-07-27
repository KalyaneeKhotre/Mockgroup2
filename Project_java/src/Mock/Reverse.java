package Mock;

public class Reverse {
	
	public static void main(String[] args)
	{
		String d="I Am Not Well";
		String a[]=d.split(" ");
		
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
		
	}

}
