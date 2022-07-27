package Array;

public class Array {
public static void main(String[] args) {
	
	String ar[]=new String[5];   //Array declaration
	ar[0]="JAVA";
	ar[1]="AUTOMATION";
	ar[2]="MANUAL";
	ar[3]="API";
	ar[4]="SELENIUM";
	//ar[5]="DEFAULT";      //Array out of bound Exception when we increase limit 
	
	System.out.println(ar[0]);//with the help of index array call
	System.out.println("-----Print all information in array-----");
	
	for(int i=0;i<=4;i++)     //Array calling
	{
	System.out.println(ar[i]);
	}
}
}

