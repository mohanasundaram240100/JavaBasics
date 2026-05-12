package ArrayProblems;

public class RepeatationOfElement {

	public static void main(String[] args) {

		int[] array= {10,230,40,50,50,60,50,50};
		int search_element = 50;
		int count=0;
		
		for(int i=0;i<=array.length-1;i++)
		{
			if(array[i]==search_element)
			{
				System.out.println("Element count: "+ count);
				count++;
				
			}
			
		}
		
		
		
		
	}

}
