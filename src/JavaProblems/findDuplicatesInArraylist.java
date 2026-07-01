package JavaProblems;

import java.util.ArrayList;
import java.util.HashSet;

public class findDuplicatesInArraylist {

	public static void main(String[] args) {

	ArrayList<String> mylist = new ArrayList<String>();
	mylist.add("Mohan");
	mylist.add("Kannan");
	mylist.add("Mohan");
	mylist.add("Lokesh");
	
	for(String list:mylist)
	{
		System.out.println("Before duplicates: "+list);
	}
	
	HashSet<String> myset = new HashSet<String>();
	
	for(String list:mylist)
	{
		if(!myset.add(list))
		{
			System.out.println(" ");
			System.out.println("Duplicate element is: "+list);
		}
		
	}
		
		
		
	}

}
