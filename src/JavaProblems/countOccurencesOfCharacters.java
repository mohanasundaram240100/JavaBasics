package JavaProblems;

import java.util.HashMap;

public class countOccurencesOfCharacters 
{
	public static void main (String[] args)
	{
		String name = "Mohanasundaram";
		name = name.toLowerCase();
		
		HashMap<Character, Integer> mymap = new HashMap<>();
		
		for(char ch:name.toCharArray())
		{
			mymap.put(ch, mymap.getOrDefault(ch, 0) + 1);
		}
		
		System.out.println(mymap);

}
}
