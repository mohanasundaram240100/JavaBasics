package basicprograms;

public class ArrayProblems_2 {
	
	public static void main (String[] args) {
		
		//To find the repeated elements in an array
		
		
		int number[]= {10,20,20,10,30,10};
		int count=10;
		int total_count=0;
		
		for(int i=0;i<number.length;i++) {
			
			if(number[i]==count) {
				
				total_count++;
				
			}
			
		}
		
		System.out.println(total_count); 
		
	}

}
