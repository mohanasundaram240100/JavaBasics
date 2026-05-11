package Arrays;

public class SingleDimArray {

	public static void main(String[] args) {

		
		
		int[] arr = {1, 2, 3, 4, 5};

		//Normal for loop
		
		for(int i=0;i<=arr.length-1;i++) {
			
			System.out.println(arr[i]);
		}
		
		
		
		int[] b = {11, 22 , 33, 44, 55};
		
		//Enhanced for loop
		
		for (int x : b)
		{
			System.out.println(x);
		}

		
		
		
	}

}
