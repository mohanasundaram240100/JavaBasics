package Arrays;

public class SingleDimArray {

	public static void main(String[] args) {

		
		
		int[] arr = {1, 2, 3, 4, 5};

		//Normal for loop
		
		for(int i=0;i<=arr.length-1;i++) 
		{
			
			System.out.println(arr[i]);
		}
		
		
		
		int[] b = {11, 22 , 33, 44, 55};
		
		//Enhanced for loop
		
		for (int x : b)
		{
			System.out.println(x);
		}

		
		int[] c = {111, 222, 333, 444, 555};
		
		//while loop
		
		int i=0;
		while(i<c.length)
		{
			System.out.println(c[i]);
			i++;
			
		}
		
		
		
	}

}
