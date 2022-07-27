package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMap_prg {

	public static void main(String[] args)
	{
		HashMap <Integer,String> map= new HashMap();
	
		map.put(34,"Kalyanee");
		map.put(45,null);
		map.put(45,"Testing");
		map.put(21,null);
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
