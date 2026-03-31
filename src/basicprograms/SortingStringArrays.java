package basicprograms;

import java.util.Arrays;

public class SortingStringArrays {

	public static void main(String[] args) {
		
		//Sorting an array in ascending order
		
		//Using char array to sort the characters in ascending order
		
		char input1[]= {'a','e','i','o','u','b','c','d'};
		
		System.out.println(Arrays.toString(input1));
		
		Arrays.sort(input1);
		
		System.out.println(Arrays.toString(input1));
		
		
		//Using String array to sort the strings in ascending order
		
		String input2[]= {"Mohan", "Kannan", "Lokesh", "Mangalam", "Baskar"};
		System.out.println(Arrays.toString(input2));
		Arrays.sort(input2);
		
		System.out.println(Arrays.toString(input2));

		
	}

}
