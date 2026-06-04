package Collections;

import java.util.HashMap;

public class HashMapExample {

	
	public static void main (String[] args) {
		
		HashMap mymap = new HashMap();
		
		HashMap<Object, Object> mymap1 = new HashMap<>();
		
		mymap.put("Name", "Mohan");
		mymap.put("Age", 26);
		mymap.put("City", "Bangalore");
		mymap.put("Age", 27);
		mymap.put(25, 2654655452L);
		mymap.put(25, 265465545);
		mymap.remove(25);
		
		mymap.put("Name", "Mohanasundaram");
		
		for(Object x:mymap.entrySet())
		{
			System.out.println(x);
		}
		
		//System.out.println(mymap1.put("Name", "Mohanasundaram"));
		
		
	}
}
