package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
	
	public static void main (String[] args) {
		
		//Declaration of ArrayList
		
		ArrayList mylist = new ArrayList();
		
		//Adding elements to the ArrayList
	
		mylist.add("Mohan");
		mylist.add(100);
		mylist.add(10.5);
		mylist.add(10.5);
		mylist.add('A');
		mylist.remove(3);
		
		System.out.println(mylist);
		
		ArrayList mylist1 = new ArrayList();
		mylist1.add("Rohan");
		mylist.set(1, "Mohan");
		System.out.println(mylist);
		
		//Using for loop
		
		for(int i=0;i<mylist.size();i++) 
		{
		
			System.out.println(mylist.get(i));
		}
		
		
		//Using for each loop
		
		for(Object list :mylist)
		{
			System.out.println(list);
		}
		
		
		//Using iterator	
		
		Iterator<Object> lists=mylist.iterator();
		while(lists.hasNext())
		{
			System.out.println(lists.next());
			
		}
		
	}

}
