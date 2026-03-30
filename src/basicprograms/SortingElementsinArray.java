package basicprograms;

import java.util.Arrays;

public class SortingElementsinArray {

	public static void main(String[] args) {

		//Sorting an array in ascending order
		
		//Using default sorting method
		int input[]= {125,10,522,254,3000,2500,300,4000,500};
		
		System.out.println(Arrays.toString(input));
		
		Arrays.sort(input);
		
		System.out.println(Arrays.toString(input));
		
		
	}

}
