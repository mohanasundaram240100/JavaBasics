package ArrayProblems;

public class linearSearch {
	
	public static void main (String[] args)
	{
		int[] array= {10,230,40,50,60};
		int search_element = 50;
		
		for(int i=0;i<=array.length-1;i++)
		{
			if(array[i]==search_element)
			{
				System.out.println("Element found at index: "+ array[i]);
				break;
				
			}
			
		}
		
		
		
	}

}
