package Collection;

import java.util.ArrayList;

public class list {

	public static void main(String[] args)
	{
		ArrayList list=new ArrayList();
		list.add(3456);
		list.add("Kalyanee");
		list.add('#');
		list.add(23.87f);
		
		int size=list.size();
		System.out.println("Size:"+size);
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		System.out.println("======================");
		list.remove(2);
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}
}
