package JavaProblems;

import java.util.ArrayList;

public class PrintArrayValues 
{
	public static void main (String [] args) 
	{
		String[] name= {"Mohan", "Kannan", "Lokesh"};
		
		for(String n:name)
		{
			System.out.println(n);
		}
		
		
		ArrayList<String> mylist = new ArrayList<String>();
		mylist.add("Palaniyappan");
		mylist.add("Mangalam");
		
		for(String list : mylist)
		{
			System.out.println(list);
		}
		
	}

}
