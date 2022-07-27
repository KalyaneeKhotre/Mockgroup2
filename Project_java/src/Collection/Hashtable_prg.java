package Collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Hashtable_prg {

	public static void main(String[] args)
	{
		Hashtable <Integer,String> map= new Hashtable();
	
		map.put(34,null);
		map.put(45,"Mumbai");
		map.put(45,"Testing");
		map.put(21,"Nashik");
		map.put(null,"Kalyanee");
		map.put(67,"Pune");
		
		for(Map.Entry<Integer, String> e: map.entrySet())
		{
			System.out.println("Key"+e.getKey()+"Value"+e.getValue());
		}
		System.out.println("=============================");
		map.put(32,"System");
		for(Map.Entry<Integer, String> e: map.entrySet())
		{
			System.out.println("Key"+e.getKey()+"Value"+e.getValue());
		}
	}
	
}
	

