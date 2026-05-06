package Collections;

import java.util.HashMap;

public class HashMapExample {

	
	public static void main (String[] args) {
		
		HashMap mymap = new HashMap();
		mymap.put("Name", "Mohan");
		mymap.put("Age", 26);
		mymap.put("City", "Bangalore");
		mymap.put("Age", 27);
		mymap.put(25, 265465545);
		mymap.put(25, 265465545);
		//mymap.remove(25);
		
		
		for(Object x:mymap.entrySet())
		{
			System.out.println(x);
		}
		
		
		
		
	}
}
