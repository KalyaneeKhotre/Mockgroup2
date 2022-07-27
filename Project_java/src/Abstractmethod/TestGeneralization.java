package Abstractmethod;

public class TestGeneralization {
	
	public static void main(String[] args) {
		
		System.out.println("***Feature of Idea***");
		Idea i=new Idea();
		i.audiocalling();
		i.SMS();
		i.Internet();
		i.NewfeatureB();
		
		System.out.println("***Feature of Jio***");
		Jio j=new Jio();
		j.audiocalling();
		j.SMS();
		j.Internet();
		j.NewfeatureA();
	}

}
