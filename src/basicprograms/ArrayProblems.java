package basicprograms;

public class ArrayProblems {

	public static void main(String[] args) {

		//Problem 1 --> Searching an element in an array
		
		int input[]= {100,2000,300,4000,500};
		int search_element=300;
		
		for(int i=0;i<input.length;i++) 
		{
			if(input[i]==search_element)
			{
			System.out.println("Element found");
			break;
				
			}
			
		}
			//System.out.println("Element not found");
		 
		
		
	}

}
