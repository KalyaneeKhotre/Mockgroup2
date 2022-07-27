package LogicalPrograms;

public class Primeno {
	
public static void main(String[] args) {
		
		int i=7,count,j;
		
		//for(i=1; i<=100; i++) {
			count = 0;
			for(j=1;j<=i; j++) {                           //i=3
				if(i%j==0)                                 //j=1,2,3
				count++;                                   //count=0,1,3
			}
			if(count==2) 
			{
				System.out.println(i);
	     		System.out.println("Prime number");
	        }
	       else
	       {
		System.out.println("not prime number");
	}
	}

}
