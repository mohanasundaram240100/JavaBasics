package Arrays;

public class TwoDimArray {
	
	public static void main (String[] args) {
		
		
		int[][] arr =  {{1,2,3},
						{4,5,6},
						{7,8,9}};
		
		//Normal for loop
		
		for (int i=0;i<arr.length;i++)
		{
			
			for(int j=0;j<arr[i].length;j++) 
			{
				
				
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
			
		}
		
		
		//Enhanced for loop
		
		for (int[] x : arr)
		{
			for (int y : x)
			{
				System.out.print(y + " ");
			}
			
			System.out.println();
		}
		
		
		
	}

}
