package LogicalPrograms;

//import java.util.Scanner;

public class Armstrong {
	
	public static void main(String[] args) {
		
		//Scanner External=new Scanner(System.in);  //sum(1*1*1)+(5*5*5)+(3*3*3)=153
		//int a=External.nextInt();
		int a=140;
		int c=a;
		int sum=0;
		
		while(a>0) {
			int b=a%10;                         //156%10=6   15%10=5   1%10=0.1=1  
			sum=sum+(b*b*b);                    //3*3*3+5*5*5+1*1*1
			a=a/10;                             //156/10=15    15/10=1   1/10=0153
		}
		if(c==sum) {
			System.out.println("The No. is Armstrong");
		}
		else {
			System.out.println("The No. is not Armstrong");
		}
		
	}

}
