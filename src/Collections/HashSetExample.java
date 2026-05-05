package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main (String[] args) {
		
		//Set myset = new HashSet(); 
		
		//Using wrapper class to specify the type of data that can be stored in the HashSet
		//HashSet<String> myset = new HashSet<String>(); 
		
		HashSet myset = new HashSet(); //Using normal HashSet without specifying the type of data that can be stored in the HashSet
		
		myset.add("Mohan");
		myset.add(1000);
		myset.add(3.14);
		myset.add("Mohan"); //Duplicate value, will not be added to the HashSet
		myset.add(null); //HashSet allows null values, but only one null value can be added
		myset.add(null);
		myset.add('A');
		
		Iterator<Object> it =myset.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		System.out.println(myset);
		
	}
	
	
}
