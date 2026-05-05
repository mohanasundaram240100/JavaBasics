package Collections;

import java.util.ArrayList;
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
		myset.add(3.14); //Duplicate value, will not be added to the HashSet
		
		myset.remove(3.14); //Removes the specified element from the HashSet if it is present
		
		boolean result =myset.contains("Mohan"); //Returns true if the HashSet contains the specified element
		System.out.println("Mohan is Present : " + result);
		
		System.out.println(myset);
		
		
		Iterator<Object> it =myset.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		//Converting HashSet to ArrayList collection
		
		ArrayList list = new ArrayList(myset);  //Using the constructor of ArrayList to convert HashSet to ArrayList
		System.out.println(list.get(0)); 		//Accessing the first element of the ArrayList using the get() method
		
		
		
	}
	
	
}
