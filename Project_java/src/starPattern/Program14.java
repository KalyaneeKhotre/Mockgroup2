package starPattern;

public class Program14 {
	public static void main(String[] args) {
		int star=4;
		int space=0;
		for(int i=1;i<=9;i++) {
			for(int j=0;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=star;j++) {
				System.out.print(" *");
			}
			if(i<=4) {
				space++;
				star--;
			}
			else {
				space--;
				star++;
			}
			System.out.println();
		}
	}


	}
