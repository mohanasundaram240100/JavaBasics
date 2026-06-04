package ArrayProblems;

import java.util.Arrays;

public class SortingAnArray {
	
	public static void main (String[] args) {
		
		int[] array = {12, 11, 13, 5, 6};
		
		for (int x : array)
		{
			System.out.print(x + " ");
		}
		
		Arrays.sort(array);
		
		System.out.println();
		
		
		
		for (int x : array)
		{
			System.out.print(x + " ");
		}

	}

}
