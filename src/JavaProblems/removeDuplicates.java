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
		
		
	}

}
