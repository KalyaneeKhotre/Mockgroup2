package starPattern;

public class Program {
 public static void main(String[] args) {
	 int s=5;
	 int m=6;
	 for(int i=1;i<=s;i++) {
		 for(int j=1;j<=m;j++) {
			 if(i==1||j==1||i==s||j==m)
				 System.out.print("*");
			 else
				 System.out.print(" ");
		 }
		 System.out.println();
		 }
	 }
 
}
