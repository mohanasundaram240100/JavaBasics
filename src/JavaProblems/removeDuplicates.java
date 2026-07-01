package JavaProblems;

import java.util.ArrayList;
import java.util.HashSet;

public class removeDuplicates {

	public static void main(String[] args) 
	{

		ArrayList<String> mylist = new ArrayList<String>();
		mylist.add("Mohan");
		mylist.add("Kannan");
		mylist.add("Mohan");
		mylist.add("Lokesh");
		
		HashSet<String> myset = new HashSet<String>(mylist);
		
		for(String set:myset)
		{
			System.out.println(set);
			
		}
		
		
		String[] name= {"Mohan", "Kannan", "Mohan", "Lokesh"};
		HashSet<String> myset1 = new HashSet<String>();
		
		for(String s: name)
		{
			myset1.add(s);
		}
		
		for(String set:myset1)
		{
			System.out.println(set);
		}
	}

}
