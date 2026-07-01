package JavaProblems;

import java.util.HashMap;

public class countOccurencesOfStrings 
{
	public static void main (String [] args) 
	{
		String name= "Mohana Sundaram";
		name=name.toLowerCase();
		String[] words =name.split(" ");
		
		HashMap<String, Integer> mymap = new HashMap<>();
		for(String ch:words)
		{
			mymap.put(ch, mymap.getOrDefault(ch,0)+1);
		}
		
		System.out.println(mymap);

	}

}
