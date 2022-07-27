package Collection;

import java.util.ArrayList;

public class list1 {
	
	public static void main(String[] args)
	{
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(3456);
		list.add(5678);
		list.add(5689);
		list.add(8954);
		
		int size=list.size();
		System.out.println("Size:"+size);
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("============================");
		list.remove(2);
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}

}
