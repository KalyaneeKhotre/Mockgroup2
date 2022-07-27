package operators;

public class IfelseDemo {
	public static void main(String[] args)
	{
		int age=18;
		if(age>=65)
		{
			System.out.println("Senior Citizen");
		}
		else if(age>=60)
		{
			System.out.println("Citizen");
		}
		else if(age>=25)
		{
			System.out.println("Youth");
		}
		else
		{
			System.out.println("Childrens");
		}
	}

}
